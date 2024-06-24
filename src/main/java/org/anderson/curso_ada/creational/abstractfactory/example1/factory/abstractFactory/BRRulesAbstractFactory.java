package org.anderson.curso_ada.creational.abstractfactory.example1.factory.abstractFactory;

import org.anderson.curso_ada.creational.abstractfactory.example1.model.certificate.Certificate;
import org.anderson.curso_ada.creational.abstractfactory.example1.model.certificate.CertificateBR;
import org.anderson.curso_ada.creational.abstractfactory.example1.model.packing.Packing;
import org.anderson.curso_ada.creational.abstractfactory.example1.model.packing.PackingBR;

public class BRRulesAbstractFactory implements CountryRulesAbstractFactory{
    @Override
    public Certificate getCertificate() {
        return new CertificateBR();
    }

    @Override
    public Packing getPacking() {
        return new PackingBR();
    }
}
