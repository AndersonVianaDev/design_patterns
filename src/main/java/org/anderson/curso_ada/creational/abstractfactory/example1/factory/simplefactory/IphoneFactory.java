package org.anderson.curso_ada.creational.abstractfactory.example1.factory.simplefactory;

import org.anderson.curso_ada.creational.abstractfactory.example1.factory.abstractFactory.CountryRulesAbstractFactory;
import org.anderson.curso_ada.creational.abstractfactory.example1.model.iphone.Iphone;
import org.anderson.curso_ada.creational.abstractfactory.example1.model.iphone.Iphone11;
import org.anderson.curso_ada.creational.abstractfactory.example1.model.iphone.IphoneX;

public class IphoneFactory {

    private CountryRulesAbstractFactory rules;

    public IphoneFactory(CountryRulesAbstractFactory rules) {
        this.rules = rules;
    }

    public Iphone createIphone(String level) {
        Iphone iphone = null;
        if("11".equalsIgnoreCase(level)) {
            iphone = new Iphone11(rules);
        } else if("x".equalsIgnoreCase(level)) {
            iphone = new IphoneX(rules);
        }

        return iphone;
    }

}
