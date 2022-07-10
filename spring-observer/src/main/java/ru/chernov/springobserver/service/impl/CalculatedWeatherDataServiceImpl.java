package ru.chernov.springobserver.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.chernov.springobserver.model.WeatherData;
import ru.chernov.springobserver.service.CalculatedWeatherDataService;

@Slf4j
@Service
public class CalculatedWeatherDataServiceImpl implements CalculatedWeatherDataService {

    @Override
    public void processWeatherConditions(WeatherData weatherData) {
        log.info(
                "\n==============================\n" +
                        "Calculate: " + weatherData.getTemperature() +
                        weatherData.getHumidity() +
                        weatherData.getHumidity() +
                        "\n==============================\n"
        );
    }
}
