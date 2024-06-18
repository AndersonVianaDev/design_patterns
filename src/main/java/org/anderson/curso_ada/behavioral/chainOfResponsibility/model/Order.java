package org.anderson.curso_ada.behavioral.chainOfResponsibility.model;

public class Order {
    private String nameProduct;
    private Integer creditScore;
    private String address;

    protected Order(String nameProduct, String address, Integer creditScore) {
        this.nameProduct = nameProduct;
        this.address = address;
        this.creditScore = creditScore;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public Integer getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(Integer creditScore) {
        this.creditScore = creditScore;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
