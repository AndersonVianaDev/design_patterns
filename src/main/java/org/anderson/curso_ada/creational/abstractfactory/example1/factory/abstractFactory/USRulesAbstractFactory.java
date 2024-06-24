package org.anderson.curso_ada.creational.abstractfactory.example1.factory.abstractFactory;

import org.anderson.curso_ada.creational.abstractfactory.example1.model.certificate.Certificate;
import org.anderson.curso_ada.creational.abstractfactory.example1.model.certificate.CertificateUS;
import org.anderson.curso_ada.creational.abstractfactory.example1.model.packing.Packing;
import org.anderson.curso_ada.creational.abstractfactory.example1.model.packing.PackingUS;

public class USRulesAbstractFactory implements CountryRulesAbstractFactory{
    @Override
    public Certificate getCertificate() {
        return new CertificateUS();
    }

    @Override
    public Packing getPacking() {
        return new PackingUS();
    }
}
