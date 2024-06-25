package org.anderson.curso_ada.creational.singleton.example2;

import org.anderson.curso_ada.creational.singleton.example2.model.Connection;
import org.anderson.curso_ada.creational.singleton.example2.model.ConnectionPool;

public class Main {
    public static void doQuery1() {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        if(connection != null) connection.query("SELECT * FROM A1");
        pool.leaveConnection(connection);
    }

    public static void doQuery2() {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        if(connection != null) connection.query("SELECT * FROM A2");
        pool.leaveConnection(connection);
    }

    public static void doQuery3() {
        System.out.println("Veio aq");
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        if(connection != null) connection.query("SELECT * FROM A3");
    }

    public static void main(String[] args) {
        doQuery1();
        doQuery2();
        doQuery3();
    }
}
