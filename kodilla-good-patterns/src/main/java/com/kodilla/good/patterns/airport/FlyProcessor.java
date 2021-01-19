package com.kodilla.good.patterns.airport;

import com.kodilla.good.patterns.airport.model.Airport;
import com.kodilla.good.patterns.airport.service.SearchService;

public class FlyProcessor {

    private SearchService searchService;
    private Airport airport;

    public FlyProcessor(SearchService searchService, Airport airport) {
        this.searchService = searchService;
        this.airport = airport;
    }

    public void find(Airport airport) {
        boolean isFindFrom = searchService.findFrom(airport);
        boolean isFindTo = searchService.findTo(airport);
        boolean isFindIndirect = searchService.findIndirect(airport);

        if (isFindFrom) {
            System.out.println("Znaleziono lot z: " + airport.getName());
        } else {
            System.out.println("Nie ma takiego lotu.");
        }
        if (isFindTo) {
            System.out.println("Znaleziono lot do : " + airport.getName());
        } else {
            System.out.println("Nie ma takiego odlotu.");
        }
        if (isFindIndirect) {
            System.out.println("Znaleziono lot przez : " + airport.getName());
        } else {
            System.out.println("Nie ma lotniska pośredniego.");
        }
    }
}