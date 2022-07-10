package ru.chernov.observer.service;

import ru.chernov.observer.library.WeatherData;

public interface Subject {

    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
    WeatherData getWeatherData();
}
