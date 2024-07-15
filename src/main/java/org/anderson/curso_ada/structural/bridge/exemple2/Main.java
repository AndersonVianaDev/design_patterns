package org.anderson.curso_ada.structural.bridge.exemple2;

import org.anderson.curso_ada.structural.bridge.exemple2.dao.UserDAO;
import org.anderson.curso_ada.structural.bridge.exemple2.dao.UserMongoDAO;
import org.anderson.curso_ada.structural.bridge.exemple2.dao.UserPostgresDAO;
import org.anderson.curso_ada.structural.bridge.exemple2.model.User;
import org.anderson.curso_ada.structural.bridge.exemple2.services.UserEJB;
import org.anderson.curso_ada.structural.bridge.exemple2.services.UserRest;
import org.anderson.curso_ada.structural.bridge.exemple2.services.UserService;

public class Main {
    public static void main(String[] args) {
        User userPostgres = new User("String", "string", "string@gmail.com");
        UserDAO daoPostgres = new UserPostgresDAO();
        UserService serviceRest = new UserRest(daoPostgres);

        serviceRest.save(userPostgres);

        User userMongo = new User("string", "string", "string@gmail.com");
        UserDAO daoMongo = new UserMongoDAO();
        UserService serviceEJB = new UserEJB(daoMongo);

        System.out.println("----------------------------------------");
        serviceEJB.save(userMongo);
    }
}
