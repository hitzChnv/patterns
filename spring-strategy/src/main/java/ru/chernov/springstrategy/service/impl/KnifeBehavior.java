package ru.chernov.springstrategy.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import ru.chernov.springstrategy.service.WeaponBehavior;

import static ru.chernov.springstrategy.enums.WeaponType.KNIFE;

@Slf4j
@Component
public class KnifeBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        log.info("Now using KNIFE to fight!");
    }

    @Override
    public String getWeaponType() {
        return KNIFE.name();
    }
}
