package org.anderson.curso_ada.behavioral.strategy.example1.strategy;

import org.anderson.curso_ada.behavioral.strategy.example1.model.Employee;

import java.math.BigDecimal;

public class CalculatorInternship implements CalculatorStrategy {

    @Override
    public void calculateAdjustment(Employee employee) {
        BigDecimal salary = employee.getSalary();
        employee.setSalary(salary.add(salary.multiply(new BigDecimal(0.05))));
    }
}
