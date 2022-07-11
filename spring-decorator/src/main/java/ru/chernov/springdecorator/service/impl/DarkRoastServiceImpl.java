package ru.chernov.springdecorator.service.impl;

import ru.chernov.springdecorator.service.BeverageService;

public class DarkRoastServiceImpl implements BeverageService {

    @Override
    public double calculateCost() {
        return 3.5;
    }

    @Override
    public String generateDescription() {
        return "Dark roast";
    }
}
