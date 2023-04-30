package net.roszczyk.factory1;

public class Disc extends Part {
    @Override
    public String getPrimaryInterface() {
        return "sata";
    }

    @Override
    public String connectToInterface(String name) {
        return "podłączono do interfesju: " + name;
    }
}
