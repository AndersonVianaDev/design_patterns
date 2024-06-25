package org.anderson.curso_ada.creational.builder.example2.builders;

public class JustFriesBuilder extends FastFoodMealBuilder {

    @Override
    public void buildDrink() {

    }

    @Override
    public void buildMain() {

    }

    @Override
    public void buildSide() {
        meal.setSide("Large fries");
    }

    @Override
    public void buildDessert() {

    }

    @Override
    public void buildGift() {

    }
}
