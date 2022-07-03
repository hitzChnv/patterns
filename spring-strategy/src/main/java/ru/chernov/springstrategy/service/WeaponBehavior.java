package ru.chernov.springstrategy.service;

import ru.chernov.springstrategy.enums.WeaponType;

public interface WeaponBehavior {

    void useWeapon();

    boolean isFetch(WeaponType type);
}
