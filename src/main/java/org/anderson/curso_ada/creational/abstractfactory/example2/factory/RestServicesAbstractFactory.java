package org.anderson.curso_ada.creational.abstractfactory.example2.factory;

import org.anderson.curso_ada.creational.abstractfactory.example2.services.car.CarRestService;
import org.anderson.curso_ada.creational.abstractfactory.example2.services.car.CarService;
import org.anderson.curso_ada.creational.abstractfactory.example2.services.user.UserRestService;
import org.anderson.curso_ada.creational.abstractfactory.example2.services.user.UserService;

public class RestServicesAbstractFactory implements ServicesAbstractFactory{
    @Override
    public UserService getUserService() {
        return new UserRestService();
    }

    @Override
    public CarService getCarService() {
        return new CarRestService();
    }
}
