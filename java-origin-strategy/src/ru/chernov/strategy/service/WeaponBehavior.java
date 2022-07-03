package ru.chernov.strategy.service;

import ru.chernov.strategy.enums.WeaponType;

public interface WeaponBehavior {

    void useWeapon();

    boolean isFetch(WeaponType type);
}
