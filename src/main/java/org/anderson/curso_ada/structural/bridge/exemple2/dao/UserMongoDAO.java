package org.anderson.curso_ada.structural.bridge.exemple2.dao;

import org.anderson.curso_ada.structural.bridge.exemple2.model.User;

public class UserMongoDAO implements UserDAO {
    @Override
    public void save(User user) {
        System.out.println("Saving the user in the Mongo Database");
    }
}
