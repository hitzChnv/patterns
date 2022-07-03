package ru.chernov.strategy.service.impl;

import ru.chernov.strategy.enums.WeaponType;
import ru.chernov.strategy.service.WeaponBehavior;

import static ru.chernov.strategy.enums.WeaponType.SWORD;
import static ru.chernov.strategy.util.MyLogger.log;

public class SwordBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        log("Now using SWORD to fight!");
    }

    @Override
    public boolean isFetch(WeaponType type) {
        return SWORD.equals(type);
    }
}
