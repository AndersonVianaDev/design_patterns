package org.anderson.curso_ada.structural.adapter.device;

import org.anderson.curso_ada.structural.adapter.interfaces.VGA;

public class OldMonitor implements VGA {

    @Override
    public void setImage(String image) {
        System.out.println(">>>>> This is your video: " + image);
    }
}
