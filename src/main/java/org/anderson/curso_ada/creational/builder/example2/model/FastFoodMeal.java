package org.anderson.curso_ada.creational.builder.example2.model;

public class FastFoodMeal {
    private String drink;
    private String main;
    private String side;
    private String dessert;
    private String gift;


    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public String getDessert() {
        return dessert;
    }

    public void setDessert(String dessert) {
        this.dessert = dessert;
    }

    public String getGift() {
        return gift;
    }

    public void setGift(String gift) {
        this.gift = gift;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    @Override
    public String toString() {
        return "FastFoodMeal{" +
                "drink='" + drink + '\'' +
                ", main='" + main + '\'' +
                ", side='" + side + '\'' +
                ", dessert='" + dessert + '\'' +
                ", gift='" + gift + '\'' +
                '}';
    }
}
