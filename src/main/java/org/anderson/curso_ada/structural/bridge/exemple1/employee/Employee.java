package org.anderson.curso_ada.structural.bridge.exemple1.employee;

import java.math.BigDecimal;

public abstract class Employee {

    protected String name;
    protected Byte age;
    protected BigDecimal salary;

    public Employee(String name, Byte age, BigDecimal salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public Byte getAge() {
        return age;
    }

    public void setAge(Byte age) {
        this.age = age;
    }
}
