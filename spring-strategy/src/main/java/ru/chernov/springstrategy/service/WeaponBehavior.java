package ru.chernov.springstrategy.service;

import org.springframework.beans.factory.annotation.Autowired;

public interface WeaponBehavior {

    void useWeapon();

    String getWeaponType();

    @Autowired
    default void register(DesignRegistryService service) {
        service.register(getWeaponType(), this);
    }
}
