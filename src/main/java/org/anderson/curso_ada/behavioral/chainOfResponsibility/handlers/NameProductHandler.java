package org.anderson.curso_ada.behavioral.chainOfResponsibility.handlers;

import org.anderson.curso_ada.behavioral.chainOfResponsibility.model.Order;

import java.util.logging.Logger;

public class NameProductHandler extends Handler {

    private Logger log = Logger.getLogger(this.getClass().getName());

    @Override
    public boolean handler(Order order) {
        if(order.getNameProduct().equalsIgnoreCase("item 1")) {
            log.info("Name product check passed");
            return handlerNext(order);
        }
        log.info("Name product check failed");
        return false;
    }
}
