package ru.chernov.strategy;

import org.apache.log4j.BasicConfigurator;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.chernov.strategy.service.impl.StrategyServiceImpl;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class StrategyTest {

    @BeforeAll
    static void beforeAll() {
        BasicConfigurator.configure();
    }

    @Test
    @DisplayName("Реализация паттерна 'Стратегия'")
    void strategyTest() {
        var strategy = new StrategyServiceImpl();

        assertDoesNotThrow(strategy::perform);
    }
}
