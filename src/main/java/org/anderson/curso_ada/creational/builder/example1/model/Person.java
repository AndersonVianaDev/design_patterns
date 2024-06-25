package org.anderson.curso_ada.creational.builder.example1.model;

import java.time.LocalDate;

public class Person {
    private String name;
    private Integer age;
    private String document;
    private String email;
    private LocalDate birthdata;

    public Person(String name, LocalDate birthdata, String email, String document, int age) {
        this.name = name;
        this.birthdata = birthdata;
        this.email = email;
        this.document = document;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public LocalDate getBirthdata() {
        return birthdata;
    }

    public void setBirthdata(LocalDate birthdata) {
        this.birthdata = birthdata;
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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", document='" + document + '\'' +
                ", email='" + email + '\'' +
                ", birthdata=" + birthdata +
                '}';
    }
}
