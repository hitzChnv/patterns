package ru.chernov.springobserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.chernov.springobserver.model.WeatherData;

@SpringBootApplication
public class SpringObserverApplication {

    public static void main(String[] args) {
        var ctx = SpringApplication.run(SpringObserverApplication.class, args);
        ctx.publishEvent(new WeatherData(25, 90, 70));
    }
}
