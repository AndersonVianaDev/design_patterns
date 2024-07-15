package org.anderson.curso_ada.structural.bridge.exemple2.services;

import org.anderson.curso_ada.structural.bridge.exemple2.dao.UserDAO;
import org.anderson.curso_ada.structural.bridge.exemple2.model.User;

public abstract class UserService {
    protected UserDAO dao;

    public UserService(UserDAO dao) {
        this.dao = dao;
    }

    public abstract void save(User user);
}
