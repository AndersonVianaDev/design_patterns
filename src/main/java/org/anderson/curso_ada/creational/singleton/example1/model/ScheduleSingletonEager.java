package org.anderson.curso_ada.creational.singleton.example1.model;

import java.util.HashMap;
import java.util.Map;

public class ScheduleSingletonEager {

    private static final ScheduleSingletonEager INSTANCE = new ScheduleSingletonEager();

    private Map<String, Boolean> days = new HashMap<String, Boolean>();

    private ScheduleSingletonEager() {
        days.put("Monday", true);
        days.put("Tuesday", true);
        days.put("Wednesday", true);
        days.put("Thursday", true);
        days.put("Friday", true);
        days.put("Saturday", true);
        days.put("Sunday", true);
    }

    public static ScheduleSingletonEager getInstance() {
        return INSTANCE;
    }

    public Map<String, Boolean> getDays() {return days;}

    public void toOccupy(String day) {
        days.replace(day, false);
    }
}
