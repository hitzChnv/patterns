package ru.chernov.springstrategy.service;

import org.springframework.beans.factory.annotation.Autowired;
import ru.chernov.springstrategy.enums.WeaponType;

public interface WeaponBehavior {

    void useWeapon();

    WeaponType getWeaponType();

    @Autowired
    default void register(DesignRegistryService service) {
        service.register(getWeaponType().name(), this);
    }
}
