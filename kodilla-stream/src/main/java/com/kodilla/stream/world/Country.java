package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {
    private final BigDecimal quantityOfPoeple;
    private final String name;

    public Country(String name, BigDecimal quantityOfPoeple) {
        this.quantityOfPoeple = quantityOfPoeple;
        this.name = name;
    }

    public BigDecimal getPeopleQuantity() {
        return quantityOfPoeple;
    }
}
