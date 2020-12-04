package com.kodilla.testing.weather.stub;

import java.util.HashMap;
import java.util.Map;

public class TemperaturesStub implements Temperatures{


    @Override
    public Map<String, Double> getTemperatures() {
        Map<String, Double> stubResult = new HashMap<>();
        //dummy data
        stubResult.put("Rzeszow", 25.5);
        stubResult.put("Warszawa", 23.5);
        stubResult.put("Gdansk", 22.5);
        stubResult.put("Opole", 21.5);
        stubResult.put("Krakow", 26.5);

        return stubResult;
    }
}
