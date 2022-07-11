package ru.chernov.decorator.domain.decorators;

import ru.chernov.decorator.domain.Beverage;

public class Soy extends Condiment {

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 3.2;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }
}
