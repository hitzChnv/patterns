package ru.chernov.strategy.service.impl;

import ru.chernov.strategy.enums.WeaponType;
import ru.chernov.strategy.service.WeaponBehavior;

import static ru.chernov.strategy.enums.WeaponType.KNIFE;
import static ru.chernov.strategy.util.MyLogger.log;

public class KnifeBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        log("Now using KNIFE to fight!");
    }

    @Override
    public boolean isFetch(WeaponType type) {
        return KNIFE.equals(type);
    }
}
