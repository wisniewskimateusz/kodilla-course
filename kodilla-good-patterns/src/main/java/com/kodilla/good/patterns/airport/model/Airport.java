package com.kodilla.good.patterns.airport.model;

import java.util.Locale;

public class Airport {

    private String name;

    public Airport(String name) {
        this.name = name.toUpperCase(Locale.ROOT);
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Airport airport = (Airport) o;

        return name != null ? name.equals(airport.name) : airport.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "" + name;
    }
}