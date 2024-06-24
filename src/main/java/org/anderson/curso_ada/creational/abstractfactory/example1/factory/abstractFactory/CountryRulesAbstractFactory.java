package org.anderson.curso_ada.creational.abstractfactory.example1.factory.abstractFactory;

import org.anderson.curso_ada.creational.abstractfactory.example1.model.certificate.Certificate;
import org.anderson.curso_ada.creational.abstractfactory.example1.model.packing.Packing;

public interface CountryRulesAbstractFactory {

    Certificate getCertificate();

    Packing getPacking();
}
