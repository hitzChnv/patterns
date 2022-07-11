package ru.chernov.strategy.service.impl;

import lombok.extern.slf4j.Slf4j;
import ru.chernov.strategy.enums.WeaponType;
import ru.chernov.strategy.service.WeaponBehavior;

import static ru.chernov.strategy.enums.WeaponType.SWORD;

@Slf4j
public class SwordBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        log.info("Now using SWORD to fight!");
    }

    @Override
    public boolean isFetch(WeaponType type) {
        return SWORD.equals(type);
    }
}
