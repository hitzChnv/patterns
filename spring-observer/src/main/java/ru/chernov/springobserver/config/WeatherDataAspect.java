package ru.chernov.springobserver.config;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;
import ru.chernov.springobserver.model.WeatherData;

import java.util.Arrays;

@Slf4j
@Aspect
@Configuration
public class WeatherDataAspect {

    @After("execution(public * ru.chernov.springobserver.service.impl.WeatherDataServiceImpl.*handle(..))")
    public void afterProcessAspect(JoinPoint joinPoint) {
        Arrays.stream(joinPoint.getArgs())
                .map(WeatherData.class::cast)
                .forEach(this::displayWeatherData);
    }

    private void displayWeatherData(WeatherData weatherData) {
        log.info(
                "\nCurrent temperature: " + weatherData.getTemperature() +
                        "\nCurrent humidity: " + weatherData.getHumidity() +
                        "\nCurrent pressure: " + weatherData.getPressure()
        );
    }
}
