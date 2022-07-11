package ru.chernov.observer;

import org.apache.log4j.BasicConfigurator;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.chernov.observer.domain.WeatherData;
import ru.chernov.observer.service.impl.CurrentConditionsDisplay;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ObserverTest {

    @BeforeAll
    static void beforeAll() {
        BasicConfigurator.configure();
    }

    @Test
    @DisplayName("Реализация паттерна 'Наблюдатель' - все наблюдатели должны получить текущие изменения")
    void shouldNotifyAllObservers() {
        var weatherData = new WeatherData();
        new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(80.0, 65.0, 30.4);
        weatherData.setMeasurements(85.0, 74.0, 26.2);
        weatherData.setMeasurements(90.0, 80.0, 29.4);

        assertEquals(90.0, weatherData.getTemperature());
        assertEquals(80.0, weatherData.getHumidity());
        assertEquals(29.4, weatherData.getPressure());
    }
}
