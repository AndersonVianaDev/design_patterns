package org.anderson.curso_ada.behavioral.strategy.service;

import org.anderson.curso_ada.behavioral.strategy.model.Employee;
import org.anderson.curso_ada.behavioral.strategy.strategy.CalculatorStrategy;

public class AnnualAdjustmentCalculator {
    public static void Calculate(Employee employee, CalculatorStrategy calculator) {
        calculator.calculateAdjustment(employee);
    }
}
