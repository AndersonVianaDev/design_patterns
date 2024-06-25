package org.anderson.curso_ada.creational.builder.example3;

import org.anderson.curso_ada.creational.builder.example3.model.FastFoodMeal;

public class Main {
    public static void main(String[] args) {
        FastFoodMeal burguerCombo = new FastFoodMeal.Builder()
                .drink("milkShake")
                .main("tripleCheddar")
                .side("Onion rings")
                .dessert("Large IceCream")
                .gift("hospital pass")
                .build();

        System.out.println(burguerCombo);
    }
}
