package org.anderson.curso_ada.behavioral.strategy.model;

import org.anderson.curso_ada.behavioral.strategy.enums.TypeContractEnum;

import java.math.BigDecimal;

public class Employee {
    private String name;
    private BigDecimal salary;
    private TypeContractEnum typeContract;

    protected Employee(String name, BigDecimal salary, TypeContractEnum typeContract) {
        this.name = name;
        this.salary = salary;
        this.typeContract = typeContract;
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

    public TypeContractEnum getTypeContract() {
        return typeContract;
    }

    public void setTypeContract(TypeContractEnum typeContract) {
        this.typeContract = typeContract;
    }
}
