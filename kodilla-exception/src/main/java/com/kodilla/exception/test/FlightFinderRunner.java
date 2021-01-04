package com.kodilla.exception.test;

public class FlightFinderRunner {
    public static void main(String[] args) {

        Flight flight1 = new Flight("Warsaw", "Berlin");    //istnieje, true
        Flight flight2 = new Flight("Moscow", "New York");  //istnieje, false
        Flight flight3 = new Flight("Madrid", "Warsaw");    //istnieje, true
        Flight flight4 = new Flight("London", "Madrid");   //nie istnieje
        Flight flight5 = new Flight("Warsaw", "Radom");   //nie istnieje

        FlightFinder flightFinder = new FlightFinder();

        System.out.println(flightFinder.airports);

        try {
            System.out.println(flightFinder.findFlight(flight4));
        } catch (RouteNotFoundException e) {
            e.printStackTrace();
        } finally {
            System.out.println("End");
        }
    }
}
