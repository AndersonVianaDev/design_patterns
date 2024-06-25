package org.anderson.curso_ada.behavioral.chainOfResponsibility.example1;

import org.anderson.curso_ada.behavioral.chainOfResponsibility.example1.handlers.AddressHandler;
import org.anderson.curso_ada.behavioral.chainOfResponsibility.example1.handlers.CreditScoreHandler;
import org.anderson.curso_ada.behavioral.chainOfResponsibility.example1.handlers.Handler;
import org.anderson.curso_ada.behavioral.chainOfResponsibility.example1.handlers.NameProductHandler;
import org.anderson.curso_ada.behavioral.chainOfResponsibility.example1.model.Order;
import org.anderson.curso_ada.behavioral.chainOfResponsibility.example1.model.OrderBuilder;

public class Main {
    public static void main(String[] args) {
        Handler nameProductHandler = new NameProductHandler();
        Handler creditScoreHandler = new CreditScoreHandler();
        Handler addressHandler = new AddressHandler();

        nameProductHandler.setNext(creditScoreHandler).setNext(addressHandler);

        Order orderPassed = new OrderBuilder().nameProdcut("item 1")
                .creditScore(700)
                .address("Rio de Janeiro")
                .build();


        Order orderFailed = new OrderBuilder().nameProdcut("item 1")
                .creditScore(300)
                .address("Rio de Janeiro")
                .build();

        if(nameProductHandler.handler(orderFailed)) {
            System.out.println("Order processed successfully");
        } else {
            System.out.println("Order processing failed");
        }


    }
}
