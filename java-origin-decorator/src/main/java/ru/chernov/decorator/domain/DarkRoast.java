package ru.chernov.decorator.domain;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Dark roast";
    }

    @Override
    public double cost() {
        return 5.0;
    }
}
