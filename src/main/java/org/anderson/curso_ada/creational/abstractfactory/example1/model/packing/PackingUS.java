package org.anderson.curso_ada.creational.abstractfactory.example1.model.packing;

public class PackingUS implements Packing {

    @Override
    public String pack() {
        return "\t- Packing US\n";
    }
}
