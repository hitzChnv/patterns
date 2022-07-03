package ru.chernov.springstrategy;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ConfigurableApplicationContext;
import ru.chernov.springstrategy.service.StartService;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class SpringStrategyApplicationTests {

    @Autowired
    private StartService startService;

    @Test
    void contextLoads() {

        assertThat(startService).isNotNull();
    }

}
