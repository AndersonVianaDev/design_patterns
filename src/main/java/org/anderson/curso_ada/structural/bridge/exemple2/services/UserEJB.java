package org.anderson.curso_ada.structural.bridge.exemple2.services;

import org.anderson.curso_ada.structural.bridge.exemple2.dao.UserDAO;
import org.anderson.curso_ada.structural.bridge.exemple2.model.User;

public class UserEJB extends UserService{
    public UserEJB(UserDAO dao) {
        super(dao);
    }

    @Override
    public void save(User user) {
        System.out.println("Saving...");
        dao.save(user);
    }
}
