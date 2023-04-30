package net.roszczyk.factory1;

public class Memory extends Part {
    @Override
    public String getPrimaryInterface() {
        return "soDimm";
    }

    @Override
    public String connectToInterface(String name) {
        return "podłączono interfejs soDimm";
    }
}
