package ru.chernov.springstrategy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.chernov.springstrategy.service.StartService;

@SpringBootApplication
public class SpringStrategyApplication {

    public static void main(String[] args) {
        var ctx = SpringApplication.run(SpringStrategyApplication.class, args);

        var start = ctx.getBean(StartService.class);
        start.perform();
    }
}
