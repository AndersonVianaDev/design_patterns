package org.anderson.curso_ada.behavioral.chainOfResponsibility.handlers;

import org.anderson.curso_ada.behavioral.chainOfResponsibility.model.Order;

import java.util.logging.Logger;

public class AddressHandler extends Handler {

    private Logger log = Logger.getLogger(this.getClass().getName());

    @Override
    public boolean handler(Order order) {
        if(order.getAddress().equalsIgnoreCase("Rio de Janeiro")) {
            log.info("Address check passed");
            return handlerNext(order);
        }
        log.info("Address check failed");
        return false;
    }
}
