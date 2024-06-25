package org.anderson.curso_ada.creational.builder.example2.builders;

public class FatMealBuilder extends FastFoodMealBuilder{
    @Override
    public void buildDrink() {
        meal.setDrink("milkShake");
    }

    @Override
    public void buildMain() {
        meal.setMain("tripleCheddar");
    }

    @Override
    public void buildSide() {
        meal.setSide("Onion rings");
    }

    @Override
    public void buildDessert() {
        meal.setDessert("Large IceCream");
    }

    @Override
    public void buildGift() {
        meal.setSide("hospital pass");
    }


}
