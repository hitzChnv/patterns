package ru.chernov.springobserver.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import ru.chernov.springobserver.model.WeatherData;
import ru.chernov.springobserver.service.CurrentWeatherConditionsService;

@Slf4j
@Service
public class CurrentWeatherConditionsServiceImpl implements CurrentWeatherConditionsService {

    @Override
    @EventListener
    public void displayCurrentWeatherConditions(WeatherData weatherData) {
        log.info(
                "\nCurrent temperature: " + weatherData.getTemperature() +
                        "\nCurrent humidity: " + weatherData.getHumidity() +
                        "\nCurrent pressure: " + weatherData.getPressure()
        );
    }

    @Override
    public void processWeatherConditions(WeatherData weatherData) {
        log.info(
                "\nCurrent temperature: " + weatherData.getTemperature() +
                        "\nCurrent humidity: " + weatherData.getHumidity() +
                        "\nCurrent pressure: " + weatherData.getPressure()
        );
    }
}
