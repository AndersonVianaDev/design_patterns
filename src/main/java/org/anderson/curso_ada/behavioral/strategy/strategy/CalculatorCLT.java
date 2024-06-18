package org.anderson.curso_ada.behavioral.strategy.strategy;

import org.anderson.curso_ada.behavioral.strategy.model.Employee;

import java.math.BigDecimal;

public class CalculatorCLT implements CalculatorStrategy {
    @Override
    public void calculateAdjustment(Employee employee) {
        BigDecimal salary = employee.getSalary();
        employee.setSalary(salary.add(salary.multiply(new BigDecimal(0.05))));
    }
}
