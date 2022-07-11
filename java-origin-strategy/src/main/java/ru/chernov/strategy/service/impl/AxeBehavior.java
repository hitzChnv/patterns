package ru.chernov.strategy.service.impl;

import lombok.extern.slf4j.Slf4j;
import ru.chernov.strategy.enums.WeaponType;
import ru.chernov.strategy.service.WeaponBehavior;

import static ru.chernov.strategy.enums.WeaponType.AXE;

@Slf4j
public class AxeBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        log.info("Now using AXE to fight!");
    }

    @Override
    public boolean isFetch(WeaponType type) {
        return AXE.equals(type);
    }
}
