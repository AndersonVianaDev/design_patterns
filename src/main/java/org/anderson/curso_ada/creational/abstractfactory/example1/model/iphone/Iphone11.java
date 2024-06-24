package org.anderson.curso_ada.creational.abstractfactory.example1.model.iphone;

import org.anderson.curso_ada.creational.abstractfactory.example1.factory.abstractFactory.CountryRulesAbstractFactory;

public class Iphone11 extends Iphone {
    public Iphone11(CountryRulesAbstractFactory rules) {
        super(rules);
    }

    @Override
    public void getHardware() {
        System.out.println("Hardware List");
        System.out.println("\t- 6.1in screen");
        System.out.println("\t- A13 chipset");
        System.out.println("\t- 4gb RAM");
        System.out.println("\t- 8GB memory");
    }
}
