package org.anderson.curso_ada.creational.prototype.example2.builder;

import org.anderson.curso_ada.creational.prototype.example2.model.Address;
import org.anderson.curso_ada.creational.prototype.example2.model.User;

public class UserBuilder {
    private String name;
    private Byte age;
    private Address address;

    public UserBuilder name(String name) {
        this.name = name;
        return this;
    }

    public UserBuilder age(Byte age) {
        this.age = age;
        return this;
    }

    public UserBuilder address(Address address) {
        this.address = address;
        return this;
    }

    public User build() {
        return new User(name, age, address);
    }
}
