package ru.chernov.decorator.domain;

import lombok.Data;

/**
 * Основная сущность, которую необходимо декорировать
 */
@Data
public abstract class Beverage {

    protected String description = "Unknown Beverage";

    public abstract double cost();
}
