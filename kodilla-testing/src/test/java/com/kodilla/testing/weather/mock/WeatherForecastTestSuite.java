package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import java.util.*;

import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.doubleThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class WeatherForecastTestSuite {
    private static Map<String, Double> temperaturesMap = new HashMap<>();
    private static double averageExpected;
    private static double medianExpected;

    @Mock
    private Temperatures temperaturesMock;

    @BeforeAll
    public static void beforeAllTests() {
        temperaturesMap.put("Rzeszow", 25.5);
        temperaturesMap.put("Warszawa", 23.5);
        temperaturesMap.put("Gdansk", 22.5);
        temperaturesMap.put("Opole", 21.5);
        temperaturesMap.put("Krakow", 26.5);
        averageExpected = 23.9;
        medianExpected = 23.5;
    }
    @AfterAll
    public static void afterAllTests(){
        System.out.println("All test passed!");
    }


    @Test
    void testCalculateForecastWithMock() {
        //Given
        when(temperaturesMock.getTemperatures()).thenReturn(this.temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();
        //Then
        Assertions.assertEquals(5, quantityOfSensors);
    }


    @Test
    void testAverageTemperatures(){
        //Given
        when(temperaturesMock.getTemperatures()).thenReturn(this.temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        //When
        double average = weatherForecast.getAverageTemperature();
        //Then
        Assertions.assertEquals(averageExpected, average);


    }
    @Test
    void testMedianTemperatures() {
        //Given
        when(temperaturesMock.getTemperatures()).thenReturn(this.temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        //When
        double median = weatherForecast.getMedianTemperature();
        //Then
        Assertions.assertEquals(medianExpected, median);

    }
}
