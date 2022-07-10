package ru.chernov.springobserver.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WeatherData {

    private double temperature;
    private double humidity;
    private double pressure;
}
