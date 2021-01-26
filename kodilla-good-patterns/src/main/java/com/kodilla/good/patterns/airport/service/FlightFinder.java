package com.kodilla.good.patterns.airport.service;

import com.kodilla.good.patterns.airport.FlyGenerator;
import com.kodilla.good.patterns.airport.model.Airport;
import com.kodilla.good.patterns.airport.model.Flight;

import java.util.List;
import java.util.stream.Collectors;

public class FlightFinder implements SearchService {

    private FlyGenerator flyGenerator;

    public FlightFinder(FlyGenerator flyGenerator) {
        this.flyGenerator = flyGenerator;
    }

    @Override
    public List<Flight> findArrivalAirport(Airport airport) {
        return flyGenerator.getFlightList().stream()
                .filter(x -> x.getArrivalAirport().equals(airport))
                .collect(Collectors.toList());
    }

    @Override
    public List<Flight> findDepartureAirport(Airport airport) {
        return flyGenerator.getFlightList().stream()
                .filter(x -> x.getDepartureAirport().equals(airport))
                .collect(Collectors.toList());
    }

    @Override
    public List<Flight> findIntermediateAirport(Airport airport) {
        return flyGenerator.getFlightList().stream()
                .filter(x -> x.getIntermediateAirport().equals(airport))
                .collect(Collectors.toList());
    }
}
