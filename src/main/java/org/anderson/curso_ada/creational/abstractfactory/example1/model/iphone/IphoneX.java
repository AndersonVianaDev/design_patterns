package org.anderson.curso_ada.creational.abstractfactory.example1.model.iphone;

import org.anderson.curso_ada.creational.abstractfactory.example1.factory.abstractFactory.CountryRulesAbstractFactory;

public class IphoneX extends Iphone{
    public IphoneX(CountryRulesAbstractFactory rules) {
        super(rules);
    }

    @Override
    public void getHardware() {
        System.out.println("Hardware List");
        System.out.println("\t- 5.1in screen");
        System.out.println("\t- A12 chipset");
        System.out.println("\t- 2gb RAM");
        System.out.println("\t- 4GB memory");
    }
}
