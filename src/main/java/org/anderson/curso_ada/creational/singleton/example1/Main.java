package org.anderson.curso_ada.creational.singleton.example1;

import org.anderson.curso_ada.creational.singleton.example1.model.ScheduleSingletonEnum;

public class Main {
    public static void main(String[] args) {
        /*ScheduleSingletonEager scheduleSingletonEager = ScheduleSingletonEager.getInstance();

        System.out.println(scheduleSingletonEager.getDays());

        scheduleSingletonEager.toOccupy("Monday");
        scheduleSingletonEager.toOccupy("Tuesday");

        System.out.println(scheduleSingletonEager.getDays());*/

        /*ScheduleSingletonLazy scheduleSingletonLazy = ScheduleSingletonLazy.getInstance();

        System.out.println(scheduleSingletonLazy.getDays());

        scheduleSingletonLazy.toOccupy("Monday");
        scheduleSingletonLazy.toOccupy("Tuesday");

        System.out.println(scheduleSingletonLazy.getDays());*/


        ScheduleSingletonEnum scheduleSingletonEnum = ScheduleSingletonEnum.getInstance();

        System.out.println(scheduleSingletonEnum.getDays());

        scheduleSingletonEnum.toOccupy("Monday");
        scheduleSingletonEnum.toOccupy("Tuesday");

        System.out.println(scheduleSingletonEnum.getDays());
    }
}
