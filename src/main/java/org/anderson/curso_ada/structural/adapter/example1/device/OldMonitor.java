package org.anderson.curso_ada.structural.adapter.example1.device;

import org.anderson.curso_ada.structural.adapter.example1.interfaces.VGA;

public class OldMonitor implements VGA {

    @Override
    public void setImage(String image) {
        System.out.println(">>>>> This is your video: " + image);
    }
}
