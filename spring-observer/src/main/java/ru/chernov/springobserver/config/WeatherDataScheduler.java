package ru.chernov.springobserver.config;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import ru.chernov.springobserver.model.WeatherData;
import ru.chernov.springobserver.service.WeatherDataService;

import static java.lang.Math.random;

@Configuration
@EnableScheduling
@RequiredArgsConstructor
public class WeatherDataScheduler {

    private final WeatherDataService weatherDataService;

    @Scheduled(fixedDelayString = "10000")
    public void scheduleWeatherData() {
        weatherDataService.update(
                new WeatherData(random() * 100, random() * 100, random() * 100)
        );
    }
}
