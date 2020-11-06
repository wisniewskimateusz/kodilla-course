package com.kodilla.exception.test;

public class FlightFinderRunner {
    public static void main(String[] args) {

        Flight flight1 = new Flight("Warsaw", "Berlin");
        Flight flight2 = new Flight("Moscow", "New York");
        Flight flight3 = new Flight("Madrid", "Warsaw");
        Flight flight4 = new Flight("London", "Berlin");

        FlightFinder flightFinder = new FlightFinder();

        try {
            flightFinder.findFlight(flight1);
        } catch (RouteNotFoundException e) {
            e.printStackTrace();
        } finally {
            System.out.println("End");
        }
    }
}
