package org.anderson.curso_ada.creational.abstractfactory.example2.services.car;

public class CarRestService implements CarService{
    @Override
    public void save(String car) {
        System.out.println("Saving "+ car +" with Rest");
    }

    @Override
    public boolean delete(byte id) {
        System.out.println("Deleting car with "+ id +" with Rest");
        return true;
    }
}
