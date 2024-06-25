package org.anderson.curso_ada.creational.singleton.example2.model;

public class Connection {
    private Boolean inUse;

    public Connection() {
        inUse = false;
    }

    public Object query(String sql) {
        System.out.println("Running query '"+ sql +"' in Connection " + this.inUse);
        return null;
    }

    boolean isInUse() {
        return inUse;
    }

    void setInUse(boolean status) {
        inUse = status;
    }

}
