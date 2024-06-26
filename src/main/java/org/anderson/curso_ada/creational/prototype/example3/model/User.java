package org.anderson.curso_ada.creational.prototype.example3.model;

public class User {

    private final String name;
    private final Byte age;
    private final Address address;

    public User(String name, Byte age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Byte getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }

    public User clone() {
        Address cloneAddress = address.clone();
        return new User(name, age, cloneAddress);
    }

    public Builder cloneBuilder() {
        return new Builder(name, age, address);
    }

    public static class Builder {
        private String name;
        private Byte age;
        private Address address;

        private Builder(String name, Byte age, Address address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(Byte age) {
            this.age = age;
            return this;
        }

        public Builder address(Address address) {
            this.address = address;
            return this;
        }

        public User build() {
            return new User(name, age, address);
        }
    }
}
