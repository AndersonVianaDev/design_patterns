package org.anderson.curso_ada.creational.prototype.model;

public class Button {
    private String color;
    private Integer width;
    private Integer height;

    public Button(String color, Integer width, Integer height) {
        this.color = color;
        this.width = width;
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Button{" +
                "color='" + color + '\'' +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
