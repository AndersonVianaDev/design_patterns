package org.anderson.curso_ada.creational.prototype.example1.factory;

import org.anderson.curso_ada.creational.prototype.example1.model.Button;

public class ButtonFactory {

    public static Button getInstance(Button prototype) {
        return new Button(prototype.getColor(), prototype.getWidth(), prototype.getHeight());
    }
}
