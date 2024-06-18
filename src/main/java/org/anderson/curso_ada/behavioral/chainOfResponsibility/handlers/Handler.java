package org.anderson.curso_ada.behavioral.chainOfResponsibility.handlers;


import org.anderson.curso_ada.behavioral.chainOfResponsibility.model.Order;

public abstract class Handler {

    private Handler nextHandler;

    public Handler setNext(Handler handler) {
        this.nextHandler = handler;
        return handler;
    }

    public abstract boolean handler(Order order);

    protected boolean handlerNext(Order order) {
        if (nextHandler != null) {
            return nextHandler.handler(order);
        }
        return true;
    }

}
