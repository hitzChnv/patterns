package ru.chernov.springstrategy.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.chernov.springstrategy.enums.WeaponType;
import ru.chernov.springstrategy.model.Troll;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StartService {

    private final List<WeaponBehavior> weaponBehaviors;

    public void perform() {
        var troll = new Troll();

        weaponBehaviors.stream()
                .filter(wb -> wb.isFetch(WeaponType.BOW_AND_ARROW))
                .forEach(troll::setWeaponBehavior);

        troll.fight();
    }
}
