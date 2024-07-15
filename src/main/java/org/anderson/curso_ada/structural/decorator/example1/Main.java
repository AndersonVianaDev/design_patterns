package org.anderson.curso_ada.structural.decorator.example1;

import org.anderson.curso_ada.structural.decorator.example1.model.Drink;
import org.anderson.curso_ada.structural.decorator.example1.model.Expresso;
import org.anderson.curso_ada.structural.decorator.example1.model.decorators.DoubleDrink;
import org.anderson.curso_ada.structural.decorator.example1.model.decorators.Milk;

public class Main {

    public static void order(String name, Drink drink) {
        System.out.println("Ordering a " + name);
        drink.serve();
        System.out.println(drink.getPrice());
        System.out.println("---------------------");
    }

    public static void main(String[] args) {
        order("expresso", new Expresso());
        order("double expresso", new DoubleDrink(new Expresso()));
        order("cafe au lait", new Milk(new Expresso()));
    }
}
