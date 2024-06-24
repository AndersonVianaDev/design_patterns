package org.anderson.curso_ada.creational.abstractfactory.example2;

import org.anderson.curso_ada.creational.abstractfactory.example2.factory.RestServicesAbstractFactory;
import org.anderson.curso_ada.creational.abstractfactory.example2.services.car.CarService;
import org.anderson.curso_ada.creational.abstractfactory.example2.services.user.UserService;

public class Main {
    public static void main(String[] args) {
        UserService userServiceRest = new RestServicesAbstractFactory().getUserService();
        CarService carServiceRest = new RestServicesAbstractFactory().getCarService();

        userServiceRest.save("Anderson");
        userServiceRest.update("Aaaaaa");

        carServiceRest.save("Fiat");
        carServiceRest.delete((byte) 1);

    }
}
