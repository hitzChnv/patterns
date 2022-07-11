package ru.chernov.decorator.domain.decorators;

import ru.chernov.decorator.domain.Beverage;

public class Whip extends Condiment {

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 1.0;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }
}
