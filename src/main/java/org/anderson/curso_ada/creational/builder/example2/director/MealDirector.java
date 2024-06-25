package org.anderson.curso_ada.creational.builder.example2.director;

import org.anderson.curso_ada.creational.builder.example2.builders.FastFoodMealBuilder;
import org.anderson.curso_ada.creational.builder.example2.model.FastFoodMeal;

public class MealDirector {

    private FastFoodMealBuilder builder;

    public MealDirector(FastFoodMealBuilder builder) {
        this.builder = builder;
    }

    public void constructorCombo() {
        builder.buildDrink();
        builder.buildMain();
        builder.buildSide();
        builder.buildDessert();
        builder.buildGift();
    }

    public FastFoodMeal getCombo() {
        return builder.getMeal();
    }
}
