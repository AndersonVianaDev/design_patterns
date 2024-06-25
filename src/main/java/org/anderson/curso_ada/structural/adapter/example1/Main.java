package org.anderson.curso_ada.structural.adapter.example1;

import org.anderson.curso_ada.structural.adapter.example1.adapters.HDMIToOldMonitorAdapter;
import org.anderson.curso_ada.structural.adapter.example1.adapters.HDMIToVGAAdapter;
import org.anderson.curso_ada.structural.adapter.example1.device.Computer;
import org.anderson.curso_ada.structural.adapter.example1.device.OldMonitor;
import org.anderson.curso_ada.structural.adapter.example1.device.TV;

public class Main {
    public static void main(String[] args) {
        System.out.println("### HDMI ###");
        TV tv = new TV();
        Computer computer = new Computer();
        OldMonitor oldMonitor = new OldMonitor();

        computer.connectPort(tv);
        computer.sendImageAndSound("Soccer", "GOAL");

        System.out.println("### VGA ###");

        computer.connectPort(new HDMIToVGAAdapter(oldMonitor));
        computer.sendImageAndSound("Soccer", "GOAL");


        System.out.println("### HDMI to Old Monitor ###");

        HDMIToOldMonitorAdapter hdmiToOldMonitorAdapter = new HDMIToOldMonitorAdapter();
        computer.connectPort(hdmiToOldMonitorAdapter);
        computer.sendImageAndSound("Soccer", "GOAL");

    }
}
