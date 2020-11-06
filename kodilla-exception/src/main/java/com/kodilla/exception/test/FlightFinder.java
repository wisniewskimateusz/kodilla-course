package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {

    public Map<String, Boolean> airports;

    public FlightFinder() {
        airports = new HashMap<>();
        airports.put("Warsaw", true);
        airports.put("Moscow", false);
        airports.put("Berlin", true);
        airports.put("London", false);
        airports.put("New York", true);
    }

    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        for (Map.Entry<String, Boolean> entry : airports.entrySet()) {
            boolean isAirportExist = entry.getKey().equals(flight.getDepartureAirport());
            if (isAirportExist) {
                return true;
            }
        }
         throw new RouteNotFoundException("Airport does not exist.");
    }
}