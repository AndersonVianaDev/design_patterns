package org.anderson.curso_ada.creational.factory.example3.model;

public class PostgreSQLDB implements DB{
    @Override
    public void query(String sql) {
        System.out.println("Postgres DB query: " + sql);
    }

    @Override
    public void update(String sql) {
        System.out.println("Postgres DB update: " + sql);
    }
}
