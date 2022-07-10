package ru.chernov.springobserver;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import ru.chernov.springobserver.service.WeatherDataService;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class SpringObserverApplicationTests {

    @Autowired
    private WeatherDataService weatherDataService;

    @Test
    void contextLoads() {
        assertThat(weatherDataService).isNotNull();
    }
}
