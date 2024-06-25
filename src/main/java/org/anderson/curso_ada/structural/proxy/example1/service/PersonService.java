package org.anderson.curso_ada.structural.proxy.example1.service;

import org.anderson.curso_ada.structural.proxy.example1.model.Person;
import org.anderson.curso_ada.structural.proxy.example1.proxy.PersonRepositoryProxy;

public class PersonService {

    private PersonRepositoryProxy repository;

    public PersonService(PersonRepositoryProxy repository) {
        this.repository = repository;
    }

    public void save(Person person) { this.repository.save(person); }

    public Person findById(Long id) { return repository.findById(id); }
}
