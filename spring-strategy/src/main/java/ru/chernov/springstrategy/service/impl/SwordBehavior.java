package ru.chernov.springstrategy.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import ru.chernov.springstrategy.enums.WeaponType;
import ru.chernov.springstrategy.service.WeaponBehavior;

import static ru.chernov.springstrategy.enums.WeaponType.SWORD;

@Slf4j
@Component
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
