package com.kodilla.good.patterns.airport.service;

import com.kodilla.good.patterns.airport.model.Airport;
import com.kodilla.good.patterns.airport.model.Flight;

import java.util.List;

public interface SearchService {

    List<Flight> find(Airport airport);
}