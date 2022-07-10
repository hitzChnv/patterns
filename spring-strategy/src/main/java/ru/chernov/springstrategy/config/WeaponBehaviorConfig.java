package ru.chernov.springstrategy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import ru.chernov.springstrategy.service.impl.DaggersBehavior;

@Configuration
public class WeaponBehaviorConfig {

    @Lazy
    @Bean
    public DaggersBehavior daggersBehavior() {
        return new DaggersBehavior();
    }
}
