package ru.chernov.observer.service;

import ru.chernov.observer.domain.WeatherData;

public interface Subject {

    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
    WeatherData getWeatherData();
}
