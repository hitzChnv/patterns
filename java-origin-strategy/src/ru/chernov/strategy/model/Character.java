package ru.chernov.strategy.model;

import ru.chernov.strategy.service.WeaponBehavior;

import static ru.chernov.strategy.util.MyLogger.log;

public abstract class Character {

    private WeaponBehavior weaponBehavior;

    public void fight() {
        log("The character is fighting!");
        weaponBehavior.useWeapon();
    }

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }

    public WeaponBehavior getWeaponBehavior() {
        return weaponBehavior;
    }
}
