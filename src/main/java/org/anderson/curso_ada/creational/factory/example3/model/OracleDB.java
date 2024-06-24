package org.anderson.curso_ada.creational.factory.example3.model;

public class OracleDB implements DB{
    @Override
    public void query(String sql) {
        System.out.println("Oracle DB query: " + sql);
    }

    @Override
    public void update(String sql) {
        System.out.println("Oracle DB update: " + sql);
    }
}
