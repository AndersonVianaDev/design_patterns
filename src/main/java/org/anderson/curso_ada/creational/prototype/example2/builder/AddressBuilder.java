package org.anderson.curso_ada.creational.prototype.example2.builder;

import org.anderson.curso_ada.creational.prototype.example2.model.Address;

public class AddressBuilder {
    private String street;
    private String city;
    private String number;
    private String complement;

    public AddressBuilder street(String street) {
        this.street = street;
        return this;
    }

    public AddressBuilder city(String city) {
        this.city = city;
        return this;
    }

    public AddressBuilder number(String number) {
        this.number = number;
        return this;
    }

    public AddressBuilder complement(String complement) {
        this.complement = complement;
        return this;
    }

    public Address build() {
        return new Address(street, city, number, complement);
    }
}
