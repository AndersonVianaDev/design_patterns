package org.anderson.curso_ada.behavioral.strategy.model;

import org.anderson.curso_ada.behavioral.strategy.enums.TypeContractEnum;

import java.math.BigDecimal;

public class EmployeeBuilder {

    private String name;
    private BigDecimal salary;
    private TypeContractEnum typeContract;

    public EmployeeBuilder name(String name) {
        this.name = name;
        return this;
    }

    public EmployeeBuilder salary(BigDecimal salary) {
        this.salary = salary;
        return this;
    }

    public EmployeeBuilder typeContract(TypeContractEnum typeContract) {
        this.typeContract = typeContract;
        return this;
    }

    public Employee build() {
        return new Employee(name, salary, typeContract);
    }
}
