package org.anderson.curso_ada.behavioral.strategy.example1;

import org.anderson.curso_ada.behavioral.strategy.example1.enums.TypeContractEnum;
import org.anderson.curso_ada.behavioral.strategy.example1.model.Employee;
import org.anderson.curso_ada.behavioral.strategy.example1.model.EmployeeBuilder;
import org.anderson.curso_ada.behavioral.strategy.example1.service.AnnualAdjustmentCalculator;
import org.anderson.curso_ada.behavioral.strategy.example1.strategy.CalculatorInternship;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Employee employee = new EmployeeBuilder().name("Anderson")
                .salary(new BigDecimal(1500))
                .typeContract(TypeContractEnum.INTERNSHIP)
                .build();

        System.out.println("Salary: " + employee.getSalary());

        AnnualAdjustmentCalculator.Calculate(employee, new CalculatorInternship());

        System.out.printf("New salary: %.2f", employee.getSalary());
    }
}
