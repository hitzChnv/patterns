package ru.chernov.springstrategy;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import ru.chernov.springstrategy.service.DesignRegistryService;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
@ActiveProfiles("test")
class SpringStrategyApplicationTests {

    @Autowired
    private DesignRegistryService designRegistryService;

    @Test
    void contextLoads() {
        assertThat(designRegistryService).isNotNull();
    }

    @Test
    void registry() {
        var thrown = assertThrows(NullPointerException.class, () -> designRegistryService.perform());

        assertNull(thrown.getMessage());
    }
}
