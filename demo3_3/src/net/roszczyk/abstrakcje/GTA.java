package net.roszczyk.abstrakcje;

import java.io.Serializable;

public class GTA extends Komputerowe implements Serializable {
    String key;

    public GTA(String key)
    {
        this.name = "GTA";
        this.vendor = "Rock Star";
        this.pegi = "16+";
        this.key = key;
    }

    @Override
    public String toString() {
        return super.toString() + " " + key;
    }
}
