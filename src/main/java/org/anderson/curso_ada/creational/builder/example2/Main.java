package org.anderson.curso_ada.creational.builder.example2;

import org.anderson.curso_ada.creational.builder.example2.builders.FastFoodMealBuilder;
import org.anderson.curso_ada.creational.builder.example2.builders.FatMealBuilder;
import org.anderson.curso_ada.creational.builder.example2.builders.JustFriesBuilder;
import org.anderson.curso_ada.creational.builder.example2.director.MealDirector;

public class Main {
    public static void order(String name, FastFoodMealBuilder builder) {
        System.out.println("Ordering a " + name);
        MealDirector director = new MealDirector(builder);
        director.constructorCombo();
        System.out.println(director.getCombo());
        System.out.println("=================================");
    }

    public static void main(String[] args) {
        order("Fat meal", new FatMealBuilder());
        order("just fries", new JustFriesBuilder());
    }
}
