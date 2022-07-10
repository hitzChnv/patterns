package ru.chernov.springstrategy.service.impl;

import lombok.extern.slf4j.Slf4j;
import ru.chernov.springstrategy.enums.WeaponType;
import ru.chernov.springstrategy.service.WeaponBehavior;

import static ru.chernov.springstrategy.enums.WeaponType.DAGGERS;

@Slf4j
public class DaggersBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        log.info("Now using DAGGERS to fight!");
    }

    @Override
    public WeaponType getWeaponType() {
        return DAGGERS;
    }
}
