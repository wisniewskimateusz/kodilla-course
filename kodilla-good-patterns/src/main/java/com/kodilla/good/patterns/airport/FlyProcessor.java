package com.kodilla.good.patterns.airport;

import com.kodilla.good.patterns.airport.model.Airport;
import com.kodilla.good.patterns.airport.model.Flight;
import com.kodilla.good.patterns.airport.service.SearchService;

import java.util.List;

public class FlyProcessor {

    private SearchService searchService;
    private Airport airport;

    public FlyProcessor(SearchService searchService, Airport airport) {
        this.searchService = searchService;
        this.airport = airport;
    }

    public void find(Airport airport) {
        List<Flight> findArrivalFlightsList = searchService.findArrivalAirport(airport);
        List<Flight> findDeparturesFlightsList = searchService.findDepartureAirport(airport);
        List<Flight> findIntermediateFlightsList = searchService.findIntermediateAirport(airport);

        if (findArrivalFlightsList != null) {
            findArrivalFlightsList.forEach(System.out::println);
        }
        if (findDeparturesFlightsList != null) {
            findDeparturesFlightsList.forEach(System.out::println);
        }
        if (findIntermediateFlightsList != null) {
            findIntermediateFlightsList.forEach(System.out::println);
        }
    }
}