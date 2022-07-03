package ru.chernov.springstrategy.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import ru.chernov.springstrategy.enums.WeaponType;
import ru.chernov.springstrategy.service.WeaponBehavior;

import static ru.chernov.springstrategy.enums.WeaponType.BOW_AND_ARROW;

@Slf4j
@Component
public class BowAndArrowBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        log.info("Now using BOW and ARROWS to fight!");
    }

    @Override
    public boolean isFetch(WeaponType type) {
        return BOW_AND_ARROW.equals(type);
    }
}
