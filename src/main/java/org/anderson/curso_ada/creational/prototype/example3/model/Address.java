package org.anderson.curso_ada.creational.prototype.example3.model;

public class Address implements Cloneable {
    private final String street;
    private final String city;
    private final String number;
    private final String complement;

    public Address(String street, String number, String city, String complement) {
        this.street = street;
        this.number = number;
        this.city = city;
        this.complement = complement;
    }

    public String getStreet() {
        return street;
    }

    public String getComplement() {
        return complement;
    }

    public String getNumber() {
        return number;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", number='" + number + '\'' +
                ", complement='" + complement + '\'' +
                '}';
    }

    @Override
    public Address clone() {
        try {
            return (Address) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public static class Builder {
        private String street;
        private String number;
        private String city;
        private String complement;

        private Builder(String street, String number, String city, String complement) {
            this.street = street;
            this.number = number;
            this.city = city;
            this.complement = complement;
        }

        public Builder street(String street) {
            this.street = street;
            return this;
        }

        public Builder number(String number) {
            this.number = number;
            return this;
        }

        public Builder city(String city) {
            this.city = city;
            return this;
        }

        public Builder complement(String complement) {
            this.complement = complement;
            return this;
        }

        public Address build() {
            return new Address(street, number, city, complement);
        }
    }
}
