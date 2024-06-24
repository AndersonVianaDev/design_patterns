package org.anderson.curso_ada.creational.factory.exemple1.factory;

import org.anderson.curso_ada.creational.factory.exemple1.enums.ProductType;
import org.anderson.curso_ada.creational.factory.exemple1.model.Product;
import org.anderson.curso_ada.creational.factory.exemple1.model.ProductDigital;
import org.anderson.curso_ada.creational.factory.exemple1.model.ProductPhysicist;

public class ProductFactory {

    public static Product getInstance(ProductType type) {
        switch (type) {
            case PHYSICIST:
                ProductPhysicist productPhysicist = new ProductPhysicist();
                productPhysicist.setHasPhysicalDimensions(true);
                return productPhysicist;
            case DIGITAL:
                ProductDigital productDigital = new ProductDigital();
                productDigital.setHasPhysicalDimensions(false);
                return productDigital;
            default:
                throw new IllegalArgumentException("Invalid product type");
        }
    }
}
