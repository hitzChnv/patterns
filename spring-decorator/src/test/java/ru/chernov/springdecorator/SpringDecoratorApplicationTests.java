package ru.chernov.springdecorator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import ru.chernov.springdecorator.service.BeverageService;
import ru.chernov.springdecorator.service.decorators.MilkServiceImpl;
import ru.chernov.springdecorator.service.decorators.SoyServiceImpl;
import ru.chernov.springdecorator.service.decorators.WhipServiceImpl;
import ru.chernov.springdecorator.service.impl.DarkRoastServiceImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SpringDecoratorApplicationTests {

    @Test
    @DisplayName("Реализация паттерна декоратор, пока что без учёта возможностей спринга")
    void decoratorTest() {
        BeverageService beverageService = new DarkRoastServiceImpl();
        assertEquals("Dark roast", beverageService.generateDescription());
        assertEquals(3.5, beverageService.calculateCost());

        beverageService = new MilkServiceImpl(beverageService);
        assertEquals("Dark roast, Milk", beverageService.generateDescription());
        assertEquals(3.9, beverageService.calculateCost());

        beverageService = new SoyServiceImpl(beverageService);
        assertEquals("Dark roast, Milk, Soy", beverageService.generateDescription());
        assertEquals(4.5, beverageService.calculateCost());

        beverageService = new WhipServiceImpl(beverageService);
        assertEquals("Dark roast, Milk, Soy, Whip", beverageService.generateDescription());
        assertEquals(5.5, beverageService.calculateCost());
    }
}
