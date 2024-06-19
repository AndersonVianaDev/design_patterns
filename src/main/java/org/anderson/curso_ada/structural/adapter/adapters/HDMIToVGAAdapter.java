package org.anderson.curso_ada.structural.adapter.adapters;

import org.anderson.curso_ada.structural.adapter.interfaces.HDMI;
import org.anderson.curso_ada.structural.adapter.interfaces.VGA;

public class HDMIToVGAAdapter implements HDMI {
    private VGA vga;

    public HDMIToVGAAdapter(VGA vga) {
        System.out.println("Conecting the HDMI/VGA adapter...");
        this.vga = vga;
    }

    @Override
    public void setImage(String image) {
        System.out.println("Converting the image from HDMI to VGA");
        vga.setImage(image);
    }

    @Override
    public void setSound(String sound) {
        System.out.println("Sorry, We don't work with sound");
    }
}
