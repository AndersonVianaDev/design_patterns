package org.anderson.curso_ada.creational.prototype.example2;

import org.anderson.curso_ada.creational.prototype.example2.builder.AddressBuilder;
import org.anderson.curso_ada.creational.prototype.example2.builder.UserBuilder;
import org.anderson.curso_ada.creational.prototype.example2.model.Address;
import org.anderson.curso_ada.creational.prototype.example2.model.User;

public class Main {
    public static void main(String[] args) {
        Address address = new AddressBuilder().street("Trav.")
                .city("SG")
                .number("212")
                .build();
        User user1 = new UserBuilder()
                .name("Anderson")
                .age((byte) 21)
                .address(address)
                .build();

        User user2 = user1.clone();
        Address addressClone = user2.getAddress();
        addressClone.setComplement("Rua do posto");

        System.out.println("User 1: ");
        System.out.println(user1);
        System.out.println("User 2: ");
        System.out.println(user2);
    }
}
