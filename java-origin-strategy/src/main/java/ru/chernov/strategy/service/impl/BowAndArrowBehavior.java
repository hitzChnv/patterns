package ru.chernov.strategy.service.impl;

import lombok.extern.slf4j.Slf4j;
import ru.chernov.strategy.enums.WeaponType;
import ru.chernov.strategy.service.WeaponBehavior;

import static ru.chernov.strategy.enums.WeaponType.BOW_AND_ARROW;

@Slf4j
public class BowAndArrowBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        log.info("Now using BOW and ARROWS to fight!");
    }

    @Override
    public boolean isFetch(WeaponType type) {
        return BOW_AND_ARROW.equals(type);
    }
}
