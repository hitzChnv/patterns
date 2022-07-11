package ru.chernov.strategy.model;

import lombok.extern.slf4j.Slf4j;
import ru.chernov.strategy.service.WeaponBehavior;

@Slf4j
public abstract class Character {

    private WeaponBehavior weaponBehavior;

    public void fight() {
        log.info("The character is fighting!");
        weaponBehavior.useWeapon();
    }

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }

    public WeaponBehavior getWeaponBehavior() {
        return weaponBehavior;
    }
}
