package org.anderson.curso_ada.creational.factory.exemple2.model;

public abstract class Iphone {

    public abstract void getHardware();

    public void assemble() {
        System.out.println("Assembling all the hardwares");
    }

    public void certificates() {
        System.out.println("testing all the certificates");
    }

    public void pack() {
        System.out.println("Packing the device");
    }
}
