package com.kodilla.good.patterns.airport.service;

import com.kodilla.good.patterns.airport.FlyGenerator;
import com.kodilla.good.patterns.airport.FlyProcessor;
import com.kodilla.good.patterns.airport.model.Airport;
import com.kodilla.good.patterns.airport.model.Flight;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class FlightFinderTestSuite {

    private FlyGenerator flyGenerator = new FlyGenerator();
    private FlightFinder flightFinder = new FlightFinder(flyGenerator);

    @Test
    void testFindArrivalAirport() {
        //Given
        Airport airport = new Airport("WARSZAWA");

        Flight flight1 = new Flight(new Airport("GDANSK"), new Airport("WARSZAWA"), new Airport("BERLIN"));
        Flight flight3 = new Flight(new Airport("MADRID"), new Airport("WARSZAWA"), new Airport("GDANSK"));
        List<Flight> excepted = Arrays.asList(flight1, flight3);
        //When
        List<Flight> result = flightFinder.findArrivalAirport(airport);
        //Then
        assertEquals(excepted, result);
    }

    @Test
    void testFindDepartureAirport() {
        //Given
        Airport airport = new Airport("MADRID");

        Flight flight3 = new Flight(new Airport("MADRID"), new Airport("WARSZAWA"), new Airport("GDANSK"));
        List<Flight> excepted = Collections.singletonList(flight3);
        //When
        List<Flight> result = flightFinder.findDepartureAirport(airport);
        //Then
        assertEquals(excepted, result);
    }

    @Test
    void testFindIntermediateAirport() {
        //Given
        Airport airport = new Airport("BERLIN");

        Flight flight1 = new Flight(new Airport("GDANSK"), new Airport("WARSZAWA"), new Airport("BERLIN"));
        Flight flight2 = new Flight(new Airport("KRAKOW"), new Airport("SZCZECIN"), new Airport("BERLIN"));

        List<Flight> excepted = Arrays.asList(flight1, flight2);
        //When
        List<Flight> result = flightFinder.findIntermediateAirport(airport);
        //Then
        assertEquals(excepted, result);
    }
}