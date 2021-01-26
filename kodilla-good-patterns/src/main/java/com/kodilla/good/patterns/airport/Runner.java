package com.kodilla.good.patterns.airport;

import com.kodilla.good.patterns.airport.model.Airport;
import com.kodilla.good.patterns.airport.service.FlightFinder;

public class Runner {
    public static void main(String[] args) {

        FlyGenerator flyGenerator = new FlyGenerator();
        FlightFinder flightFinder = new FlightFinder(flyGenerator);

        Airport airport = new Airport("WARSZAWA");
        FlyProcessor processor = new FlyProcessor(flightFinder, airport);

        System.out.println("----------------------------------------");
        System.out.println("Wszyskie loty");
        System.out.println(flyGenerator.getFlightList());
        System.out.println("----------------------------------------");
        System.out.println("Znalezione loty");
        processor.find(airport);
    }
}