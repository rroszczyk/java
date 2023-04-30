package net.roszczyk.factory2;

public class Memory extends Part {
    @Override
    public String getPrimaryInterface() {
        return "soDimm";
    }

    @Override
    public String connectToInterface(String name) {
        return "Podłączono pamięć przy użyciu interfejsu:" + name;
    }
}
