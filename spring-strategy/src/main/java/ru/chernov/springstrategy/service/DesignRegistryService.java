package ru.chernov.springstrategy.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.chernov.springstrategy.model.Troll;

import java.util.HashMap;
import java.util.Map;

import static ru.chernov.springstrategy.enums.WeaponType.DAGGERS;

/**
 * Паттерн регистратор (+стратегия) - используется в том случае, если нужно учитывать ленивую инициализацию бинов
 * реализовано на примере класса DaggersBehavior
 */
@Service
@RequiredArgsConstructor
public class DesignRegistryService {

    private final Map<String, WeaponBehavior> weaponBehaviors = new HashMap<>();

    public void register(String weaponType, WeaponBehavior behavior) {
        weaponBehaviors.put(weaponType, behavior);
    }

    /**
     * В тестовой среде метод выбросит NPE т.к. bean DaggersBehavior будет подтягиваться лениво,
     * только в момент обращения к нему
     */
    public void perform() {
        var troll = new Troll();
        var weaponBehavior = weaponBehaviors.get(DAGGERS.name());
        troll.setWeaponBehavior(weaponBehavior);

        troll.fight();
    }
}
