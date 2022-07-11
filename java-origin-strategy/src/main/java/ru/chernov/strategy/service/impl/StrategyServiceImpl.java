package ru.chernov.strategy.service.impl;

import ru.chernov.strategy.enums.WeaponType;
import ru.chernov.strategy.model.Knight;
import ru.chernov.strategy.service.StrategyService;
import ru.chernov.strategy.service.WeaponBehavior;

import java.util.List;

public class StrategyServiceImpl implements StrategyService {

    private final List<WeaponBehavior> behaviors =  List.of(
            new SwordBehavior(),
            new AxeBehavior(),
            new BowAndArrowBehavior(),
            new KnifeBehavior()
    );

    @Override
    public void perform() {
        var knight = new Knight();

        behaviors.stream()
                .filter(wb -> wb.isFetch(WeaponType.SWORD))
                .forEach(knight::setWeaponBehavior);

        knight.fight();
    }
}
