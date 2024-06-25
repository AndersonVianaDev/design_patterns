package org.anderson.curso_ada.creational.singleton.monostate;

import org.anderson.curso_ada.creational.singleton.monostate.model.Connection;
import org.anderson.curso_ada.creational.singleton.monostate.model.ConnectionPool;

public class Main {

    public static void doQuery1() {
        ConnectionPool pool = new ConnectionPool();
        Connection connection = pool.getConnection();
        if(connection != null) connection.query("SELECT * FROM A1");
        pool.leaveConnection(connection);
    }

    public static void doQuery2() {
        ConnectionPool pool = new ConnectionPool();
        Connection connection = pool.getConnection();
        if(connection != null) connection.query("SELECT * FROM A2");
    }

    public static void doQuery3() {
        ConnectionPool pool = new ConnectionPool();
        Connection connection = pool.getConnection();
        if(connection != null) connection.query("SELECT * FROM A3");
    }
    public static void main(String[] args) {
        doQuery1();
        doQuery2();
        doQuery3();
    }
}
