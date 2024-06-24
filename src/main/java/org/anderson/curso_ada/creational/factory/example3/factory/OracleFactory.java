package org.anderson.curso_ada.creational.factory.example3.factory;

import org.anderson.curso_ada.creational.factory.example3.model.DB;
import org.anderson.curso_ada.creational.factory.example3.model.PostgreSQLDB;

public class OracleFactory implements DBFactory{
    @Override
    public DB getDatabase() {
        return new PostgreSQLDB();
    }
}
