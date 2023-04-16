package net.roszczyk.abstrakcje;

import java.io.Serializable;

public class Wiedzmin extends Komputerowe implements Serializable  {
    String serial;
    public Wiedzmin(String serial)
    {
        this.name = "Wiedźmin";
        this.vendor = "CD Project";
        this.pegi = "18+";
        this.serial = serial;
    }
    @Override
    public String toString() {
        return super.toString() + " " + serial;
    }
}
