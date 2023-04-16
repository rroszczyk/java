package net.roszczyk.abstrakcje;

import java.io.Serializable;

public abstract class Game implements Serializable {
    String name;
    String vendor;
    String pegi;
    public abstract String getName();
    public abstract void setName(String name);
    @Override
    public String toString() {
        return name + " " + vendor + " " + pegi;
    }
}
