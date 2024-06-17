package org.anderson.curso_ada.creational.builder;

import org.anderson.curso_ada.creational.builder.builder.PersonBuilder;
import org.anderson.curso_ada.creational.builder.model.Person;

public class Main {
    public static void main(String[] args) {
        // Tem que estar tudo na ordem do construtor e incluir tudo que está no construtor.
        /*Person person = new Person("Anderson",
                LocalDate.of(2002, 9, 12),
                "anderson@gmail.com",
                "12354334534",
                22);*/

        // Builder
        Person person = new PersonBuilder().name("Anderson")
                .email("anderson@gmail.com")
                .age(22)
                //.document("12365445335")
                //.birthdata(LocalDate.of(2002, 9, 12))
                .build();

        System.out.println(person);
    }
}
