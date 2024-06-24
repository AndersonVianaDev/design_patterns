package org.anderson.curso_ada.creational.abstractfactory.example2.factory;

import org.anderson.curso_ada.creational.abstractfactory.example2.services.car.CarEBJService;
import org.anderson.curso_ada.creational.abstractfactory.example2.services.car.CarRestService;
import org.anderson.curso_ada.creational.abstractfactory.example2.services.car.CarService;
import org.anderson.curso_ada.creational.abstractfactory.example2.services.user.UserEJBService;
import org.anderson.curso_ada.creational.abstractfactory.example2.services.user.UserService;

public class EBJServicesAbstractFactory implements ServicesAbstractFactory{
    @Override
    public UserService getUserService() {
        return new UserEJBService();
    }

    @Override
    public CarService getCarService() {
        return new CarEBJService();
    }
}
