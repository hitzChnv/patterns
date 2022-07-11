package ru.chernov.springdecorator.service.impl;

import ru.chernov.springdecorator.service.BeverageService;

public class DecafServiceImpl implements BeverageService {

    @Override
    public double calculateCost() {
        return 4.4;
    }

    @Override
    public String generateDescription() {
        return "Decaf";
    }
}
