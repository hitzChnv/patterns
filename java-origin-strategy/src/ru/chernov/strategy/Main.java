package ru.chernov.strategy;

import ru.chernov.strategy.enums.WeaponType;
import ru.chernov.strategy.model.Knight;
import ru.chernov.strategy.service.WeaponBehavior;
import ru.chernov.strategy.service.impl.AxeBehavior;
import ru.chernov.strategy.service.impl.BowAndArrowBehavior;
import ru.chernov.strategy.service.impl.KnifeBehavior;
import ru.chernov.strategy.service.impl.SwordBehavior;

import java.util.List;

import static ru.chernov.strategy.util.MyLogger.log;

public class Main {

    private static final List<WeaponBehavior> weaponBehaviors = List.of(
            new SwordBehavior(),
            new AxeBehavior(),
            new BowAndArrowBehavior(),
            new KnifeBehavior()
    );

    public static void main(String[] args) {
        log("Реализация паттерна стратегия на примере персонажей компьютерной игры");

        var knight = new Knight();

        weaponBehaviors.stream()
                .filter(wb -> wb.isFetch(WeaponType.SWORD))
                .forEach(knight::setWeaponBehavior);

        knight.fight();
    }
}
