package org.anderson.curso_ada.creational.factory.model;

public abstract class  Product {

    private String description;
    private Double price;
    private Boolean hasPhysicalDimensions;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Boolean getHasPhysicalDimensions() {
        return hasPhysicalDimensions;
    }

    public void setHasPhysicalDimensions(Boolean hasPhysicalDimensions) {
        this.hasPhysicalDimensions = hasPhysicalDimensions;
    }

    @Override
    public String toString() {
        return "Product{" +
                "description='" + description + '\'' +
                ", price=" + price +
                ", hasPhysicalDimensions=" + hasPhysicalDimensions +
                '}';
    }
}
