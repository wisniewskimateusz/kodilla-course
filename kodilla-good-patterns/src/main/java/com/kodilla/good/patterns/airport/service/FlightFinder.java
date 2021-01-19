package com.kodilla.good.patterns.airport.service;

import com.kodilla.good.patterns.airport.FlyGenerator;
import com.kodilla.good.patterns.airport.model.Airport;

public class FlightFinder implements SearchService {

    private FlyGenerator flyGenerator;

    public FlightFinder(FlyGenerator flyGenerator) {
        this.flyGenerator = flyGenerator;
    }

    @Override
    public boolean findFrom(Airport flightFrom) {
        return flyGenerator.getFlightList().stream()
                .anyMatch(x -> x.getDepartureAirport().equals(flightFrom));
    }

    @Override
    public boolean findTo(Airport flightTo) {
        return flyGenerator.getFlightList().stream()
                .anyMatch(x -> x.getArrivalAirport().equals(flightTo));
    }

    @Override
    public boolean findIndirect(Airport indirect) {
        return flyGenerator.getFlightList().stream()
                .anyMatch(x -> x.getIntermediateAirport().equals(indirect));
    }
}
