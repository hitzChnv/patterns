package ru.chernov.springdecorator.service.decorators;

import ru.chernov.springdecorator.service.BeverageService;
import ru.chernov.springdecorator.service.CondimentService;

public record SoyServiceImpl(BeverageService beverageService) implements CondimentService {

    @Override
    public double calculateCost() {
        return beverageService.calculateCost() + .6;
    }

    @Override
    public String generateDescription() {
        return beverageService.generateDescription() + ", Soy";
    }
}
