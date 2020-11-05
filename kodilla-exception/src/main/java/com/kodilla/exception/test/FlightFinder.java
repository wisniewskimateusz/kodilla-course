package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {

    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> airportNames = new HashMap<>();

        for (Map.Entry<String, Boolean> entry :airportNames.entrySet()) {
            if (entry.getKey().equals(flight.getArrivalAirport()) || entry.getKey().equals(flight.getDepartureAirport())) {
                System.out.println(entry.getKey());
            } else {
                throw new RouteNotFoundException("Airport does not exist.");
            }
        }


    }
}
