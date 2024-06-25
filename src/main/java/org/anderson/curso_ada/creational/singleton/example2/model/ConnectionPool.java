package org.anderson.curso_ada.creational.singleton.example2.model;

import java.util.ArrayList;
import java.util.List;

public class ConnectionPool {

    private static final ConnectionPool instance = new ConnectionPool();
    private final static int POOL_SIZE = 1;
    private List<Connection> connectionsPool;

    public static ConnectionPool getInstance() {
        return instance;
    }

    private ConnectionPool() {
        System.out.println("Creating ConnectionPool");
        connectionsPool = new ArrayList<Connection>();
        for (int i = 0; i < POOL_SIZE; i++) {
            connectionsPool.add(new Connection());
        }
    }

    public Connection getConnection() {
        Connection connection = null;
        for(Connection conn: connectionsPool) {
            if(!conn.isInUse()){
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
