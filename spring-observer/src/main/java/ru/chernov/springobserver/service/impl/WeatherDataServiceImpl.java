package ru.chernov.springobserver.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.chernov.springobserver.model.WeatherData;
import ru.chernov.springobserver.service.WeatherDataObserver;
import ru.chernov.springobserver.service.WeatherDataService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class WeatherDataServiceImpl implements WeatherDataService {

    private final List<WeatherDataObserver> observers;

    @Override
    public WeatherData update(WeatherData weatherData) {
        notifyAllObservers(weatherData);

        return weatherData;
    }

    @Override
    public WeatherData handle(WeatherData weatherData) {
        return weatherData;
    }

    private void notifyAllObservers(WeatherData weatherData) {
        observers.forEach(o -> o.processWeatherConditions(weatherData));
    }
}
