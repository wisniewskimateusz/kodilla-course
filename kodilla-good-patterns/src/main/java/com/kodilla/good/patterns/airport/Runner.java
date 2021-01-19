package com.kodilla.good.patterns.airport;

import com.kodilla.good.patterns.airport.model.Airport;
import com.kodilla.good.patterns.airport.service.FlightFinder;

public class Runner {
    public static void main(String[] args) {

        FlyGenerator flyGenerator = new FlyGenerator();
        FlightFinder flightFinder = new FlightFinder(flyGenerator);

        Airport airport = new Airport("GDANSK");

        FlyProcessor processor = new FlyProcessor(flightFinder, airport);
        processor.find(airport);

//        System.out.println("-------------");
//        System.out.println(flyGenerator.getFlightList());
    }
}