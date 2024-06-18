package org.anderson.curso_ada.structural.proxy;

import org.anderson.curso_ada.structural.proxy.model.Person;
import org.anderson.curso_ada.structural.proxy.model.PersonBuilder;
import org.anderson.curso_ada.structural.proxy.proxy.PersonRepositoryProxy;
import org.anderson.curso_ada.structural.proxy.service.PersonService;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        PersonService personService = new PersonService(new PersonRepositoryProxy());

        Person person = new PersonBuilder().name("Anderson")
                .age(22)
                .email("anderson@gmail.com")
                .birthDate(LocalDate.of(2002, 9, 12))
                .build();

        personService.save(person);

        System.out.println(personService.findById(1L));

        System.out.println("########### CACHE ###########");

        System.out.println(personService.findById(1L));

    }
}
