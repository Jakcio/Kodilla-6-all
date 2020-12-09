package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class WorldTestSuite {


    @Test
    void testGetPeopleQuantity() {

        //Given
        World earth = new World();
        Continent europe = new Continent("Europe");
        Continent asia = new Continent("Asia");



        europe.addCountry("Deutschland", new BigDecimal("80996685"));
        europe.addCountry("Poland", new BigDecimal("38346279"));
        europe.addCountry("Spain", new BigDecimal("47737941"));
        europe.addCountry("Hungary", new BigDecimal("9919128"));
        europe.addCountry("Greece", new BigDecimal("10775757"));

        asia.addCountry("Japan", new BigDecimal("128917246"));
        asia.addCountry("India", new BigDecimal("1102358999"));
        asia.addCountry("Singapore", new BigDecimal("4425720"));
        asia.addCountry("Oman", new BigDecimal("2340000"));
        asia.addCountry("Vietnam", new BigDecimal("82689518"));

        earth.addContinents(asia);
        earth.addContinents(europe);

        BigDecimal expectedValue = new BigDecimal("1508507273");

        //When
        BigDecimal totalPeople = earth.getPeopleQuantity();
        //Then
        Assert.assertEquals(expectedValue, totalPeople);






    }
}
