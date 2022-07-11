package ru.chernov.decorator.domain.decorators;

import lombok.Data;
import lombok.EqualsAndHashCode;
import ru.chernov.decorator.domain.Beverage;

/**
 * Основная сущность для всех декораторов класса Beverage
 * Наследует/реализует основной класс, который нужно декарировать + содержит ссылку на экземпляр этого класса
 */
@Data
@EqualsAndHashCode(callSuper = true)
public abstract class Condiment extends Beverage {

    protected Beverage beverage;

    @Override
    public abstract String getDescription();
}