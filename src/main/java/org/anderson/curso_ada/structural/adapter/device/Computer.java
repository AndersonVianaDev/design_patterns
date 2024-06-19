package org.anderson.curso_ada.structural.adapter.device;

import org.anderson.curso_ada.structural.adapter.interfaces.HDMI;

public class Computer {
    private HDMI port;

    public void connectPort(HDMI screen) {
        System.out.println("Connecting on HDMI port...");
        this.port = screen;
    }

    public void sendImageAndSound(String image, String sound) {
        if(port == null) {
            System.out.println("Connecting a HDMI cable first");
        } else {
            port.setImage(image);
            port.setSound(sound);
        }
    }

}
