package org.anderson.curso_ada.creational.singleton.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ScheduleSingletonLazy {

    private static ScheduleSingletonLazy INSTANCE = new ScheduleSingletonLazy();

    private Map<String, Boolean> days = new HashMap<String, Boolean>();

    private ScheduleSingletonLazy() {
        days.put("Monday", true);
        days.put("Tuesday", true);
        days.put("Wednesday", true);
        days.put("Thursday", true);
        days.put("Friday", true);
        days.put("Saturday", true);
        days.put("Sunday", true);
    }

    public static ScheduleSingletonLazy getInstance() {
        if(Objects.isNull(INSTANCE)) return INSTANCE = new ScheduleSingletonLazy();
        else return INSTANCE;
    }

    public Map<String, Boolean> getDays() { return days; }

    public void toOccupy(String day) {
        days.replace(day, false);
    }
}
