package ru.chernov.observer;

import ru.chernov.observer.domain.WeatherData;
import ru.chernov.observer.service.impl.CurrentConditionsDisplay;

import static ru.chernov.observer.util.MyLogger.log;

public class Main {

    public static void main(String[] args) {
        log("Реализация паттерна наблюдатель");
        var weatherData = new WeatherData();
        new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(80.0, 65.0, 30.4);
        weatherData.setMeasurements(85.0, 74.0, 26.2);
        weatherData.setMeasurements(90.0, 80.0, 29.4);
    }
}
