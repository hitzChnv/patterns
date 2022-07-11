package ru.chernov.decorator.domain.decorators;

import ru.chernov.decorator.domain.Beverage;

public class Milk extends Condiment {

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 1.5;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }
}
