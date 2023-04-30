package net.roszczyk.factory2;

public class Keyboard extends Part {
    @Override
    public String getPrimaryInterface() {
        return "USB";
    }

    @Override
    public String connectToInterface(String name) {
        return "Podłączono klawiaturę przy użyciu interfejsu: " + name;
    }
}
