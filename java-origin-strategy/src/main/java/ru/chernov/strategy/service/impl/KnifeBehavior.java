package ru.chernov.strategy.service.impl;

import lombok.extern.slf4j.Slf4j;
import ru.chernov.strategy.enums.WeaponType;
import ru.chernov.strategy.service.WeaponBehavior;

import static ru.chernov.strategy.enums.WeaponType.KNIFE;

@Slf4j
public class KnifeBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        log.info("Now using KNIFE to fight!");
    }

    @Override
    public boolean isFetch(WeaponType type) {
        return KNIFE.equals(type);
    }
}
