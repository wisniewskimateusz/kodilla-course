package com.kodilla.good.patterns.airport;

import com.kodilla.good.patterns.airport.model.Airport;
import com.kodilla.good.patterns.airport.model.Flight;

import java.util.ArrayList;
import java.util.List;

public class FlyGenerator {

    private List<Flight> flightList;

    public FlyGenerator() {
        flightList = new ArrayList<>();
        Flight flight1 = new Flight(new Airport("GDANSK"), new Airport("WARSZAWA"), new Airport("BERLIN"));
        Flight flight2 = new Flight(new Airport("KRAKOW"), new Airport("SZCZECIN"), new Airport("BERLIN"));
        Flight flight3 = new Flight(new Airport("MADRID"), new Airport("WARSZAWA"), new Airport("GDANSK"));
        flightList.add(flight1);
        flightList.add(flight2);
        flightList.add(flight3);
    }

    public List<Flight> getFlightList() {
        return flightList;
    }
}