package ru.chernov.springobserver.service;

import ru.chernov.springobserver.model.WeatherData;

public interface CurrentWeatherConditionsService extends WeatherDataObserver {

    void displayCurrentWeatherConditions(WeatherData weatherData);
}
