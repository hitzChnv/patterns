package ru.chernov.springstrategy.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import ru.chernov.springstrategy.model.King;

import java.util.List;
import java.util.Map;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.toMap;
import static ru.chernov.springstrategy.enums.WeaponType.DAGGERS;

/**
 * Реализация паттерна стратегия
 */
@Service
@Profile(value = "!test")
public class DesignStrategyService {

    private final Map<String, WeaponBehavior> weaponBehaviors;

    public DesignStrategyService(List<WeaponBehavior> behaviors) {
        this.weaponBehaviors = behaviors.stream().collect(toMap(b -> b.getWeaponType().name(), identity()));
    }

    public void perform() {
        var king = new King();
        var weaponBehavior = weaponBehaviors.get(DAGGERS.name());
        king.setWeaponBehavior(weaponBehavior);

        king.fight();
    }
}
