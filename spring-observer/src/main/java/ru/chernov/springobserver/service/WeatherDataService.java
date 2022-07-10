package ru.chernov.springobserver.service;

import ru.chernov.springobserver.model.WeatherData;

public interface WeatherDataService {

    WeatherData update(WeatherData weatherData);

    WeatherData handle(WeatherData weatherData);
}
