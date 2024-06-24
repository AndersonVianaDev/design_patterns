package org.anderson.curso_ada.creational.factory.exemple2;

import org.anderson.curso_ada.creational.factory.exemple2.factory.IphoneFactory;
import org.anderson.curso_ada.creational.factory.exemple2.model.Iphone;

public class Main {
    public static void main(String[] args) {
        Iphone device = IphoneFactory.orderIphone("11", "standard");


        device.getHardware();
    }
}
