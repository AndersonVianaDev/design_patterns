package org.anderson.curso_ada.structural.proxy.example1.model;

import java.time.LocalDate;

public class Person {
    private String name;
    private Integer age;
    private String email;
    private LocalDate birthdate;

    protected Person(String name, Integer age, String email, LocalDate birthdate) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", birthdate=" + birthdate +
                '}';
    }
}
