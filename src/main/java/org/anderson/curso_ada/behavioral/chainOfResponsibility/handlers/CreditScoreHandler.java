package org.anderson.curso_ada.behavioral.chainOfResponsibility.handlers;

import org.anderson.curso_ada.behavioral.chainOfResponsibility.model.Order;

import java.util.logging.Logger;

public class CreditScoreHandler extends Handler {

    private Logger log = Logger.getLogger(this.getClass().getName());

    @Override
    public boolean handler(Order order) {
         if(order.getCreditScore() > 600) {
             log.info("Credit score check passed");
             return handlerNext(order);
         }
         log.info("Credit score check failed");
         return false;
    }
}
