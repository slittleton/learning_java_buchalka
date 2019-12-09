package com.company;

public class Lamp {
    private String style;
    private boolean battery;
    private int globRading;

    public Lamp(String style, boolean battery, int globRading) {
        this.style = style;
        this.battery = battery;
        this.globRading = globRading;
    }

    public void turnOn() {
        System.out.println("Lamp -> turning on");
    }

    public String getStyle() {
        return style;
    }

    public boolean isBattery() {
        return battery;
    }

    public int getGlobRading() {
        return globRading;
    }
}
