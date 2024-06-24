package org.anderson.curso_ada.creational.abstractfactory.example1;

import org.anderson.curso_ada.creational.abstractfactory.example1.factory.abstractFactory.BRRulesAbstractFactory;
import org.anderson.curso_ada.creational.abstractfactory.example1.factory.abstractFactory.CountryRulesAbstractFactory;
import org.anderson.curso_ada.creational.abstractfactory.example1.factory.abstractFactory.USRulesAbstractFactory;
import org.anderson.curso_ada.creational.abstractfactory.example1.factory.simplefactory.IphoneFactory;
import org.anderson.curso_ada.creational.abstractfactory.example1.model.iphone.Iphone;

public class Main {
    public static void main(String[] args) {
        //CountryRulesAbstractFactory rules = new BRRulesAbstractFactory();
        CountryRulesAbstractFactory rules = new USRulesAbstractFactory();
        Iphone device = new IphoneFactory(rules).createIphone("x");

        device.pack();
        device.assemble();
        device.certificates();
        device.getHardware();
    }
}
