package com.kodilla.testing.weather.stub;

import java.time.chrono.ThaiBuddhistEra;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WeatherForecast {

    private  Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures){
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            //adding 1 celsius degree to current value
            //as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public double getAverageTemperature() {
        double x =0.0;
        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()){
            x += temperature.getValue();

        }
        double result = x/temperatures.getTemperatures().size();
        return result;
    }

    public double getMedianTemperature() {
        int k=0;
        double[] temp = new double[5];
        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()){
            temp[k++] = temperature.getValue();
        }
        Arrays.sort(temp);
        if(temp.length %2 == 0){
            return (temp[temp.length/2] + temp[temp.length/2 -1]) /2;
        } else {
            return temp[temp.length/2];
        }

    }

}
