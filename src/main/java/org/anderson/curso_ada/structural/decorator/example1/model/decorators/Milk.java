package org.anderson.curso_ada.structural.decorator.example1.model.decorators;

import org.anderson.curso_ada.structural.decorator.example1.model.Drink;

import java.math.BigDecimal;

public class Milk extends DrinkDecorator{
    public Milk(Drink drink) {
        super(drink);
    }

    @Override
    public void serve() {
        drink.serve();
        System.out.println("- Adding 30ml of milk");
    }

    @Override
    public BigDecimal getPrice() {
        return drink.getPrice().add(new BigDecimal(0.5));
    }
}
