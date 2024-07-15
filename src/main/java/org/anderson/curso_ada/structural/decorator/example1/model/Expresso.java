package org.anderson.curso_ada.structural.decorator.example1.model;

import java.math.BigDecimal;

public class Expresso implements Drink{
    @Override
    public void serve() {
        System.out.println("- Adding 50ml of expresso");
    }

    @Override
    public BigDecimal getPrice() {
        return new BigDecimal(1.50);
    }
}
