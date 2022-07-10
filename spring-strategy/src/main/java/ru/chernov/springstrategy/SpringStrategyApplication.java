package ru.chernov.springstrategy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.chernov.springstrategy.service.DesignRegistryService;
import ru.chernov.springstrategy.service.DesignStrategyService;

@SpringBootApplication
public class SpringStrategyApplication {

    public static void main(String[] args) {
        var ctx = SpringApplication.run(SpringStrategyApplication.class, args);

        var registry = ctx.getBean(DesignRegistryService.class);
        registry.perform();

        DesignStrategyService strategy = ctx.getBean(DesignStrategyService.class);
        strategy.perform();
    }
}
