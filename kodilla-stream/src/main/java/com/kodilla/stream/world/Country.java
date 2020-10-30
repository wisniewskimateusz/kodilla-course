package com.kodilla.stream.world;

import java.math.BigDecimal;

public class Country {

    private String name;
    private BigDecimal peopleQuantity;

    public Country(String name, BigDecimal peopleQuantity) {
        this.name = name;
        this.peopleQuantity = peopleQuantity;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPeopleQuantity() {
        return peopleQuantity;
    }

    //chine 1306313813
    //indie 1102355999
    //indonesia 246973100

    //poland 38386000
    //germany 83019200
    //russia 146877088

    //usa 308878120
    //canada 33989040
    //panama 3559408
}
