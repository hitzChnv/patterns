package ru.chernov.springdecorator.service.decorators;

import ru.chernov.springdecorator.service.BeverageService;
import ru.chernov.springdecorator.service.CondimentService;

public record SugarServiceImpl(BeverageService beverageService) implements CondimentService {

    @Override
    public double calculateCost() {
        return beverageService.calculateCost() + .5;
    }

    @Override
    public String generateDescription() {
        return beverageService.generateDescription() + ", Sugar";
    }
}
