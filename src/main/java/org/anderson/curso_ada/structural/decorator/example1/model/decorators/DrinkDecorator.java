package org.anderson.curso_ada.structural.decorator.example1.model.decorators;

import org.anderson.curso_ada.structural.decorator.example1.model.Drink;

public abstract class DrinkDecorator implements Drink {
    protected Drink drink;

    public DrinkDecorator(Drink drink) {
        this.drink = drink;
    }
}
