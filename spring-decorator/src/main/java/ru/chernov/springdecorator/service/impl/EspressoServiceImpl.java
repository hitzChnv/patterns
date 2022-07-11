package ru.chernov.springdecorator.service.impl;

import ru.chernov.springdecorator.service.BeverageService;

public class EspressoServiceImpl implements BeverageService {

    @Override
    public double calculateCost() {
        return 5.5;
    }

    @Override
    public String generateDescription() {
        return "Espresso";
    }
}
