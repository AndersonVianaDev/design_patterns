package org.anderson.curso_ada.creational.prototype.example1;

import org.anderson.curso_ada.creational.prototype.example1.model.Button;
import org.anderson.curso_ada.creational.prototype.example1.prototype.ButtonRegistry;

public class Main {
    public static void main(String[] args) {
        Button buttonRed = ButtonRegistry.getButton("Button red");
        Button buttonBlack = ButtonRegistry.getButton("Button black");
        Button buttonWhite = ButtonRegistry.getButton("Button white");

        System.out.println(buttonRed);
        System.out.println(buttonBlack);
        System.out.println(buttonWhite);

        ButtonRegistry.addButton("Button blue", new Button("blue", 50, 125));

        Button buttonBlue = ButtonRegistry.getButton("Button blue");

        System.out.println(buttonBlue);
    }
}
