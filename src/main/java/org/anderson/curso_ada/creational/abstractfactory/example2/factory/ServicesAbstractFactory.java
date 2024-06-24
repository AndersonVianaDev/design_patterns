package org.anderson.curso_ada.creational.abstractfactory.example2.factory;

import org.anderson.curso_ada.creational.abstractfactory.example2.services.car.CarService;
import org.anderson.curso_ada.creational.abstractfactory.example2.services.user.UserService;

public interface ServicesAbstractFactory {
    UserService getUserService();
    CarService getCarService();
}
