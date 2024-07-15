package org.anderson.curso_ada.structural.decorator.example1.model;

import java.math.BigDecimal;

public class Tea implements Drink{
    @Override
    public void serve() {
        System.out.println("- Adding 100ml of tea");
    }

    @Override
    public BigDecimal getPrice() {
        return new BigDecimal(0.1);
    }
}
