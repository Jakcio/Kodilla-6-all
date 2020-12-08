package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class Continent {
    private final String name;
    private final List<Country> countryList = new ArrayList<>();

    public Continent(String name) {
        this.name = name;
    }

    public void addCountry(String name, BigDecimal QuantityOfPeople) {
        Country country = new Country(name, QuantityOfPeople);
        this.countryList.add(country);
    }

    public List<Country> getCountryList() {
        return this.countryList;
    }


}
