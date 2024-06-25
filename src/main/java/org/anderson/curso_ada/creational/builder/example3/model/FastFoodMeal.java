package org.anderson.curso_ada.creational.builder.example3.model;

public class FastFoodMeal {
    private final String drink;
    private final String main;
    private final String side;
    private final String dessert;
    private final String gift;

    public FastFoodMeal(String drink, String main, String side, String dessert, String gift) {
        this.drink = drink;
        this.main = main;
        this.side = side;
        this.dessert = dessert;
        this.gift = gift;
    }


    public String getMain() {
        return main;
    }

    public String getDessert() {
        return dessert;
    }

    public String getGift() {
        return gift;
    }

    public String getSide() {
        return side;
    }

    public String getDrink() {
        return drink;
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

    public static class Builder {
        private String drink;
        private String main;
        private String side;
        private String dessert;
        private String gift;

        public Builder drink(String drink) {
            this.drink = drink;
            return this;
        }

        public Builder main(String main) {
            this.main = main;
            return this;
        }

        public Builder side(String side) {
            this.side = side;
            return this;
        }

        public Builder dessert(String dessert) {
            this.dessert = dessert;
            return this;
        }

        public Builder gift(String gift) {
            this.gift = gift;
            return this;
        }

        public FastFoodMeal build() {
            return new FastFoodMeal(drink, main, side, dessert, gift);
        }

    }

}
