package ru.chernov.springobserver.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.chernov.springobserver.model.WeatherData;
import ru.chernov.springobserver.service.WeatherDataService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/weather")
public class WeatherDataController {

    private final WeatherDataService weatherDataService;

    @PutMapping
    public ResponseEntity<WeatherData> updateWeatherData(@RequestBody WeatherData data) {
        return ResponseEntity.ok(weatherDataService.update(data));
    }

    @PostMapping
    public ResponseEntity<WeatherData> handleWeatherData(@RequestBody WeatherData data) {
        return ResponseEntity.ok(weatherDataService.handle(data));
    }
}
