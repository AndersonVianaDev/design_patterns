package org.anderson.curso_ada.creational.prototype.example3;

import org.anderson.curso_ada.creational.prototype.example3.model.Address;
import org.anderson.curso_ada.creational.prototype.example3.model.User;

public class Main {
    public static void main(String[] args) {
        User user = new User("ToClone", (byte) 22, new Address("ABC", "288", "RJ", null));
        System.out.println(user);

        User clonedUser = user.cloneBuilder().name("Cloned").build();
        System.out.println(clonedUser);

        User anotherUser = clonedUser.cloneBuilder()
                .age((byte) 21)
                .address(new Address("DEF", "288", "RJ", "TRAV."))
                .build();

        System.out.println(anotherUser);

        System.out.println(clonedUser);

        System.out.println(user);

    }
}
