package org.anderson.curso_ada.structural.bridge.exemple1.converter;

import org.anderson.curso_ada.structural.bridge.exemple1.employee.Employee;

import java.util.Locale;

public class CSVConverter implements Converter{
    @Override
    public String getEmployeeFormated(Employee employee) {
        return String.format(Locale.US,"%s, %d, %.2f", employee.getName(),
                employee.getAge(), employee.getSalary());
    }
}
