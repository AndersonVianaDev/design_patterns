package org.anderson.curso_ada.creational.factory;

import org.anderson.curso_ada.creational.factory.enums.ProductType;
import org.anderson.curso_ada.creational.factory.factory.ProductFactory;
import org.anderson.curso_ada.creational.factory.model.Product;

public class Main {
    public static void main(String[] args) {
        Product productPhysicist = ProductFactory.getInstance(ProductType.PHYSICIST);
        Product productDigital = ProductFactory.getInstance(ProductType.DIGITAL);

        System.out.println(productPhysicist);
        System.out.println("###############################################");
        System.out.println(productDigital);

    }
}
