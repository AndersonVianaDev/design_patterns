package org.anderson.curso_ada.creational.abstractfactory.example1.model.certificate;

public class CertificateBR implements Certificate {
    @Override
    public String applyCertification() {
        return "\t- Calibrating BR rules";
    }
}
