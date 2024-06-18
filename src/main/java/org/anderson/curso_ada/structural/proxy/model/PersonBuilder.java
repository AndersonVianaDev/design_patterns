package org.anderson.curso_ada.structural.proxy.model;

import java.time.LocalDate;

public class PersonBuilder {
    private String name;
    private Integer age;
    private String email;
    private LocalDate birthDate;

    public PersonBuilder name(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder age(Integer age) {
        this.age = age;
        return this;
    }

    public PersonBuilder email(String email) {
        this.email = email;
        return this;
    }

    public PersonBuilder birthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
        return this;
    }

    public Person build() {
        return new Person(name, age, email, birthDate);
    }
}
