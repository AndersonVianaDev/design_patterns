package org.anderson.curso_ada.creational.factory.exemple2.factory;

import org.anderson.curso_ada.creational.factory.exemple2.model.*;

public class IphoneFactory {

    public static Iphone orderIphone(String model, String version) {
        Iphone device = null;

        if("x".equalsIgnoreCase(model)) {
            if("standard".equals(version)) {
                device = new IphoneX();
            } else {
                device = new IphoneXPro();
            }
        } else if("11".equalsIgnoreCase(model)) {
            if("standard".equalsIgnoreCase(version)) {
                device = new Iphone11();
            } else {
                device = new Iphone11Pro();
            }
        }

        return device;
    }
}
