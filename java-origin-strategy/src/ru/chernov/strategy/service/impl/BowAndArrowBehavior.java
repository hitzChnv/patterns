package ru.chernov.strategy.service.impl;

import ru.chernov.strategy.enums.WeaponType;
import ru.chernov.strategy.service.WeaponBehavior;

import static ru.chernov.strategy.enums.WeaponType.BOW_AND_ARROW;
import static ru.chernov.strategy.util.MyLogger.log;

public class BowAndArrowBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        log("Now using BOW and ARROWS to fight!");
    }

    @Override
    public boolean isFetch(WeaponType type) {
        return BOW_AND_ARROW.equals(type);
    }
}
