package org.anderson.curso_ada.creational.builder.example1.builder;

import org.anderson.curso_ada.creational.builder.example1.model.Person;

import java.time.LocalDate;

public class PersonBuilder {
    private String name;
    private Integer age;
    private String document;
    private String email;
    private LocalDate birthdata;

    public PersonBuilder name(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder birthdata(LocalDate birthdata) {
        this.birthdata = birthdata;
        return this;
    }

    public PersonBuilder email(String email) {
        this.email = email;
        return this;
    }

    public PersonBuilder document(String document) {
        this.document = document;
        return this;
    }

    public PersonBuilder age(Integer age) {
        this.age = age;
        return this;
    }

    public Person build() {
        return new Person(name, birthdata, email, document, age);
    }
}
