package ru.chernov.decorator.domain;

public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 5.6;
    }
}
