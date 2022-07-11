package ru.chernov.observer.domain;

import lombok.Data;
import ru.chernov.observer.service.Observer;
import ru.chernov.observer.service.Subject;

import java.util.ArrayList;
import java.util.List;

@Data
public class WeatherData implements Subject {

    private double temperature;
    private double humidity;
    private double pressure;

    private final List<Observer> observers = new ArrayList<>();

    public void setMeasurements(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(Observer::update);
    }

    @Override
    public WeatherData getWeatherData() {
        return this;
    }
}
