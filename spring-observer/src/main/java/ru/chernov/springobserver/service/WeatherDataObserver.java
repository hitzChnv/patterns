package ru.chernov.springobserver.service;

import ru.chernov.springobserver.model.WeatherData;

public interface WeatherDataObserver {

    void processWeatherConditions(WeatherData weatherData);
}
