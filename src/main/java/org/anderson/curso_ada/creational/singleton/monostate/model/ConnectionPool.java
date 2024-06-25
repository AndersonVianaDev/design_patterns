package org.anderson.curso_ada.creational.singleton.monostate.model;

import java.util.ArrayList;
import java.util.List;

public class ConnectionPool {
    private final static int SIZE_POOL = 1;
    private static List<Connection> connectionsPool;

    static {
        System.out.println("Creating ConnectionPool");
        connectionsPool = new ArrayList<Connection>();
        for (int i = 0; i < SIZE_POOL; i++) {
            connectionsPool.add(new Connection());
        }
    }

    public ConnectionPool() {
        System.out.println("New instance of Connection Pool");
    }

    public Connection getConnection() {
        Connection connection = null;
        for(Connection conn: connectionsPool) {
            if(!conn.isInUse()) {
                connection = conn;
                break;
            }
        }
        if(connection == null) {
            System.out.println("Connection not in pool");
            return null;
        }
        connection.setInUse(true);
        return connection;
    }

    public void leaveConnection(Connection connection) {
        connection.setInUse(false);
    }
}
