package ru.chernov.springdecorator.service.impl;

import ru.chernov.springdecorator.service.BeverageService;

public class HouseBlendServiceImpl implements BeverageService {

    @Override
    public double calculateCost() {
        return 1.4;
    }

    @Override
    public String generateDescription() {
        return "House blend";
    }
}
