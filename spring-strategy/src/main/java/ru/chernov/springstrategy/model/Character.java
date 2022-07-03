package ru.chernov.springstrategy.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import ru.chernov.springstrategy.service.WeaponBehavior;

@Data
@Slf4j
@NoArgsConstructor
public abstract class Character {

    private WeaponBehavior weaponBehavior;

    public void fight() {
        log.info("The character is fighting!");
        weaponBehavior.useWeapon();
    }
}
