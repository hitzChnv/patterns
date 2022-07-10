package ru.chernov.observer.service.impl;

import ru.chernov.observer.library.WeatherData;
import ru.chernov.observer.service.DisplayElement;
import ru.chernov.observer.service.Observer;
import ru.chernov.observer.service.Subject;

import static ru.chernov.observer.util.MyLogger.log;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private double temperature;
    private double humidity;
    private double pressure;
    private final Subject subject;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.subject = weatherData;
        this.subject.registerObserver(this);
    }

    @Override
    public void update() {
        var weatherData = this.subject.getWeatherData();
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        this.pressure = weatherData.getPressure();
        display();
    }

    @Override
    public void display() {
        log(
                        "Temperature is " + temperature +
                        ". Humidity is " + humidity +
                        ". Pressure is " + pressure
        );
    }
}
