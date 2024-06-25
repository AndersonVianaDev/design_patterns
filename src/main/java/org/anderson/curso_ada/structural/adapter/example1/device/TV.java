package org.anderson.curso_ada.structural.adapter.example1.device;

import org.anderson.curso_ada.structural.adapter.example1.interfaces.HDMI;

public class TV implements HDMI {
    @Override
    public void setImage(String image) {
        System.out.println(">>>>> This is your video: " + image);
    }

    @Override
    public void setSound(String sound) {
        System.out.println(">>>>> This is your sound: " + sound);
    }
}
