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
        List<Flight> findFlightsList = searchService.find(airport);

        if (findFlightsList != null) {
            findFlightsList.forEach(System.out::println);
        }
    }
}