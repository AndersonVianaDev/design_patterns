package org.anderson.curso_ada.creational.abstractfactory.example2.services.car;

public class CarEBJService implements CarService{

    @Override
    public void save(String car) {
        System.out.println("Saving "+ car +" with EBJ");
    }

    @Override
    public boolean delete(byte id) {
        System.out.println("Deleting Car with "+ id +" with EBJ");
        return true;
    }
}
