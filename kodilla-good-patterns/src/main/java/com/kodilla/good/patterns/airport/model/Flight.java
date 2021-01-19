package com.kodilla.good.patterns.airport.model;

public class Flight {

    private Airport departureAirport; //wylot
    private Airport arrivalAirport; //przylot
    private Airport intermediateAirport;; //pośrednie

    public Flight(Airport departureAirport, Airport arrivalAirport, Airport intermediateAirport) {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.intermediateAirport = intermediateAirport;
    }

    public Airport getDepartureAirport() {
        return departureAirport;
    }

    public Airport getArrivalAirport() {
        return arrivalAirport;
    }

    public Airport getIntermediateAirport() {
        return intermediateAirport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        if (departureAirport != null ? !departureAirport.equals(flight.departureAirport) : flight.departureAirport != null)
            return false;
        if (arrivalAirport != null ? !arrivalAirport.equals(flight.arrivalAirport) : flight.arrivalAirport != null)
            return false;
        return intermediateAirport != null ? intermediateAirport.equals(flight.intermediateAirport) : flight.intermediateAirport == null;
    }

    @Override
    public int hashCode() {
        int result = departureAirport != null ? departureAirport.hashCode() : 0;
        result = 31 * result + (arrivalAirport != null ? arrivalAirport.hashCode() : 0);
        result = 31 * result + (intermediateAirport != null ? intermediateAirport.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Flight{ z " + departureAirport +
                " -> przez " + intermediateAirport +
                " -> do " + arrivalAirport +
                '}' + "\n";
    }
}
