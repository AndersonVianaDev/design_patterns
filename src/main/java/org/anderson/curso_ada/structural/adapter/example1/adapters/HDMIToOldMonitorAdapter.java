package org.anderson.curso_ada.structural.adapter.example1.adapters;

import org.anderson.curso_ada.structural.adapter.example1.device.OldMonitor;
import org.anderson.curso_ada.structural.adapter.example1.interfaces.HDMI;

public class HDMIToOldMonitorAdapter extends OldMonitor implements HDMI {

    public HDMIToOldMonitorAdapter() {
        super();
        System.out.println("Wrapping the VGA's Old Monitor's interface with HDMI adapter.");
    }

    @Override
    public void setSound(String sound) {
        System.out.println("Sorry, We don't work with sound");
    }
}
