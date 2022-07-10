package ru.chernov.springobserver.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WeatherData {

    private double temperature;
    private double humidity;
    private double pressure;
}
