package org.anderson.curso_ada.creational.builder.example2.builders;

public class JustFriesBuilder extends FastFoodMealBuilder {

    @Override
    public void buildSide() {
        meal.setSide("Large fries");
    }
    
}
