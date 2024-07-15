package org.anderson.curso_ada.structural.decorator.example1.model.decorators;

import org.anderson.curso_ada.structural.decorator.example1.model.Drink;

import java.math.BigDecimal;

public class DoubleDrink extends DrinkDecorator{

    public DoubleDrink(Drink drink) {
        super(drink);
    }

    @Override
    public void serve() {
        drink.serve();
        drink.serve();
    }

    @Override
    public BigDecimal getPrice() {
        return drink.getPrice().add(new BigDecimal(1.75));
    }
}
