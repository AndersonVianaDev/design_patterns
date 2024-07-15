package org.anderson.curso_ada.structural.bridge.exemple1;

import org.anderson.curso_ada.structural.bridge.exemple1.converter.CSVConverter;
import org.anderson.curso_ada.structural.bridge.exemple1.converter.Converter;
import org.anderson.curso_ada.structural.bridge.exemple1.converter.JsonConverter;
import org.anderson.curso_ada.structural.bridge.exemple1.employee.Employee;
import org.anderson.curso_ada.structural.bridge.exemple1.employee.ITGuy;
import org.anderson.curso_ada.structural.bridge.exemple1.employee.ProjectManager;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Employee projectManager = new ProjectManager("Anderson", (byte) 22, new BigDecimal(5000));
        Employee tiGuy = new ITGuy("Anderson", (byte) 22, new BigDecimal(2000));

        Converter json = new JsonConverter();
        Converter csv = new CSVConverter();

        System.out.println(json.getEmployeeFormated(projectManager));
        System.out.println(json.getEmployeeFormated(tiGuy));
        System.out.println(csv.getEmployeeFormated(projectManager));
        System.out.println(csv.getEmployeeFormated(tiGuy));
    }
}
