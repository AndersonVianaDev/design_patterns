package org.anderson.curso_ada.structural.bridge.exemple1.converter;

import org.anderson.curso_ada.structural.bridge.exemple1.employee.Employee;

public class JsonConverter implements Converter{
    @Override
    public String getEmployeeFormated(Employee employee) {
        return new StringBuilder().append("{\n")
                .append("\t\"name\": \"").append(employee.getName()).append("\",\n")
                .append("\t\"age\": \"").append(employee.getAge()).append("\",\n")
                .append("\t\"salary\": \"").append(employee.getSalary()).append("\",\n")
                .append("}")
                .toString();
    }
}
