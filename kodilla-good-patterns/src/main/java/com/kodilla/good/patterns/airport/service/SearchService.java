package com.kodilla.good.patterns.airport.service;

import com.kodilla.good.patterns.airport.model.Airport;

public interface SearchService {

    boolean findFrom(Airport flightTo);
    boolean findTo(Airport flightFrom);
    boolean findIndirect(Airport indirect);
}