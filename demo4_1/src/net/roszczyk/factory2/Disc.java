package net.roszczyk.factory2;

public class Disc extends Part implements IPart {
    @Override
    public String getPrimaryInterface() {
        return "sata";
    }

    @Override
    public String connectToInterface(String name) {
        return "Podłączono dysk przy użyciu interfesju: " + name;
    }

    @Override
    public String getPartName() {
        return "disc";
    }

    @Override
    public Part getInstance() {
        return new Disc();
    }
}
