package org.anderson.curso_ada.structural.bridge.exemple1.converter;

import org.anderson.curso_ada.structural.bridge.exemple1.employee.Employee;

public class CSVConverter implements Converter{
    @Override
    public String getEmployeeFormated(Employee employee) {
        return String.format("%s, %d, %.2f", employee.getName(),
                employee.getAge(), employee.getSalary());
    }
}
