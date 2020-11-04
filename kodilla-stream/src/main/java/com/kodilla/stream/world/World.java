package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {

    private List<Continent> continents = new ArrayList();

    public World(List<Continent> continents) {
        this.continents = continents;
    }

    public List<Continent> getContinents() {
        return continents;
    }

    public BigDecimal getPeopleQuantity() {
        return continents.stream()
                .flatMap(continent -> continent.getCountries().stream())
                .map(country -> country.getPeopleQuantity())
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}