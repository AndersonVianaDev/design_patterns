package org.anderson.curso_ada.creational.abstractfactory.example1.model.iphone;

import org.anderson.curso_ada.creational.abstractfactory.example1.factory.abstractFactory.CountryRulesAbstractFactory;

public abstract class Iphone {
    CountryRulesAbstractFactory rules;

    public Iphone(CountryRulesAbstractFactory rules) {
        this.rules = rules;
    }

    public abstract void getHardware();

    public void assemble() {
        System.out.println("Assembling all the hardwares");
    }

    public void certificates() {
        System.out.println("Certificate all the certificates");
        System.out.println(rules.getCertificate().applyCertification());
    }

    public void pack() {
        System.out.println("Packing the device");
        System.out.println(rules.getPacking().pack());
    }
}
