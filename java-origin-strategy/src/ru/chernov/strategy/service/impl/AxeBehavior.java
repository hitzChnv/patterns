package ru.chernov.strategy.service.impl;

import ru.chernov.strategy.enums.WeaponType;
import ru.chernov.strategy.service.WeaponBehavior;

import static ru.chernov.strategy.enums.WeaponType.AXE;
import static ru.chernov.strategy.util.MyLogger.log;

public class AxeBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        log("Now using AXE to fight!");
    }

    @Override
    public boolean isFetch(WeaponType type) {
        return AXE.equals(type);
    }
}
