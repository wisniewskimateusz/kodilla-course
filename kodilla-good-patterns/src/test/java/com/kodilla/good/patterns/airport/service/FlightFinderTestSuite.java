package com.kodilla.good.patterns.airport.service;

import com.kodilla.good.patterns.airport.FlyGenerator;
import com.kodilla.good.patterns.airport.FlyProcessor;
import com.kodilla.good.patterns.airport.model.Airport;
import com.kodilla.good.patterns.airport.model.Flight;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlightFinderTestSuite {

    private SearchService searchService;

    @Test
    void testFind() {
        //Given
//        FlyGenerator flyGenerator = new FlyGenerator();
//        FlightFinder flightFinder = new FlightFinder(flyGenerator);

        Airport airport = new Airport("WARSZAWA");
        //FlyProcessor processor = new FlyProcessor(flightFinder, airport);
        Flight flight1 = new Flight(new Airport("GDANSK"), new Airport("WARSZAWA"), new Airport("BERLIN"));
        Flight flight3 = new Flight(new Airport("MADRID"), new Airport("WARSZAWA"), new Airport("GDANSK"));

        //When
        List<Flight> flights = Arrays.asList(flight1, flight3);
        List<Flight> result = searchService.find(airport);

        //Then
        assertEquals(flights, result);
    }
}