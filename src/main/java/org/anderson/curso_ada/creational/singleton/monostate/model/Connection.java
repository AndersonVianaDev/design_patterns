package org.anderson.curso_ada.creational.singleton.monostate.model;

public class Connection {

    private boolean inUse;

    public Connection() {
        inUse = false;
    }

    public Object query(String sql) {
        System.out.println("Running query '"+ sql +"' in Connection " + this.inUse);
        return null;
    }

    public boolean isInUse() {
        return inUse;
    }

    public void setInUse(boolean status) {
        this.inUse = status;
    }
}
