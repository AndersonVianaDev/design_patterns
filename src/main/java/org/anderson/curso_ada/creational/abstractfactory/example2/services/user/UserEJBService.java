package org.anderson.curso_ada.creational.abstractfactory.example2.services.user;

public class UserEJBService implements UserService{
    @Override
    public void save(String model) {
        System.out.println("Saving "+ model +" with EJB");
    }

    @Override
    public void update(String newModel) {
        System.out.println("Updating "+ newModel +" with EJB");
    }
}
