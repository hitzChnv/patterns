package ru.chernov.springstrategy.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import ru.chernov.springstrategy.enums.WeaponType;
import ru.chernov.springstrategy.service.WeaponBehavior;

import static ru.chernov.springstrategy.enums.WeaponType.AXE;

@Slf4j
@Component
public class AxeBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        log.info("Now using AXE to fight!");
    }

    @Override
    public WeaponType getWeaponType() {
        return AXE;
    }
}
