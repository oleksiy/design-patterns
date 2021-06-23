package com.designpatterns.app.observer;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@Slf4j
public class WeatherStation {
    @Test
    public void testWeatherStation() {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay display = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(72, 100, 32.2f);
        weatherData.setMeasurements(62, 50, 30.1f);
        assertNotNull(weatherData.getObservers());
    }
}
