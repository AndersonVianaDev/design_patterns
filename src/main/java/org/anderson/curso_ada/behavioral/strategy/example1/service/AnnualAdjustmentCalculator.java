package org.anderson.curso_ada.behavioral.strategy.example1.service;

import org.anderson.curso_ada.behavioral.strategy.example1.model.Employee;
import org.anderson.curso_ada.behavioral.strategy.example1.strategy.CalculatorStrategy;

public class AnnualAdjustmentCalculator {
    public static void Calculate(Employee employee, CalculatorStrategy calculator) {
        calculator.calculateAdjustment(employee);
    }
}
