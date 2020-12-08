package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country implements Counter {
    private final BigDecimal quantityOfPoeple;
    private final String name;

    public Country(String name, BigDecimal quantityOfPoeple) {
        this.quantityOfPoeple = quantityOfPoeple;
        this.name = name;
    }

    @Override
    public BigDecimal getPeopleQuantity() {
        return quantityOfPoeple;
    }
}
