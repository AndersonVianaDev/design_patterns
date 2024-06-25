package org.anderson.curso_ada.creational.prototype.example1.prototype;

import org.anderson.curso_ada.creational.prototype.example1.factory.ButtonFactory;
import org.anderson.curso_ada.creational.prototype.example1.model.Button;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ButtonRegistry {

    private static ButtonRegistry buttonRegistry = null;

    private static Map<String, Button> REGISTRY = new HashMap<>();

    static {
        REGISTRY.put("Button red", new Button("red", 35, 123));
        REGISTRY.put("Button black", new Button("black", 40, 125));
        REGISTRY.put("Button white", new Button("white", 50, 130));
    }

    public static ButtonRegistry getInstance() {
        if(Objects.isNull(buttonRegistry)) return buttonRegistry =  new ButtonRegistry();
        return buttonRegistry;
    }

    public static Button getButton(String key) {
        return ButtonFactory.getInstance(REGISTRY.get(key));
    }

    public static void addButton(String key, Button button) {
        REGISTRY.put(key, button);
    }
}
