package org.anderson.curso_ada.creational.builder.example2.builders;

import org.anderson.curso_ada.creational.builder.example2.model.FastFoodMeal;

public abstract class FastFoodMealBuilder {
    protected FastFoodMeal meal;

    public FastFoodMealBuilder() {
        meal = new FastFoodMeal();
    }

    public FastFoodMeal getMeal() {
        return meal;
    }

    public abstract void buildDrink();
    public abstract void buildMain();
    public abstract void buildSide();
    public abstract void buildDessert();
    public abstract void buildGift();


}
