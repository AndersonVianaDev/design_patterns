package org.anderson.curso_ada.behavioral.chainOfResponsibility.model;

public class OrderBuilder {
    private String nameProduct;
    private Integer creditScore;
    private String address;

    public OrderBuilder nameProdcut(String nameProduct) {
        this.nameProduct = nameProduct;
        return this;
    }

    public OrderBuilder creditScore(Integer creditScore) {
        this.creditScore = creditScore;
        return this;
    }

    public OrderBuilder address(String address) {
        this.address = address;
        return this;
    }

    public Order build() {
        return new Order(nameProduct, address, creditScore);
    }
}
