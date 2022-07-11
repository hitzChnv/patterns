package ru.chernov.decorator;

import org.apache.log4j.BasicConfigurator;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.chernov.decorator.domain.Beverage;
import ru.chernov.decorator.domain.Espresso;
import ru.chernov.decorator.domain.decorators.Milk;
import ru.chernov.decorator.domain.decorators.Soy;
import ru.chernov.decorator.domain.decorators.Whip;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DecoratorTest {

    @BeforeAll
    static void beforeAll() {
        BasicConfigurator.configure();
    }

    @Test
    @DisplayName("Реализация паттерна 'Декоратор'")
    void decoratorTest() {
        Beverage beverage = new Espresso();
        assertEquals("Espresso", beverage.getDescription());
        assertEquals(5.6, beverage.cost());

        beverage = new Milk(beverage);
        assertEquals("Espresso, Milk", beverage.getDescription());
        assertEquals(7.1, beverage.cost());

        beverage = new Soy(beverage);
        assertEquals("Espresso, Milk, Soy", beverage.getDescription());
        assertEquals(10.3, beverage.cost());

        beverage = new Whip(beverage);
        assertEquals("Espresso, Milk, Soy, Whip", beverage.getDescription());
        assertEquals(11.3, beverage.cost());
    }
}
