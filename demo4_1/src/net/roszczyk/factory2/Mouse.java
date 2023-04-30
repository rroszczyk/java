package net.roszczyk.factory2;

public class Mouse extends Part implements IPart {
    @Override
    public String getPartName() {
        return "mouse";
    }

    @Override
    public Part getInstance() {
        return new Mouse();
    }

    @Override
    public String getPrimaryInterface() {
        return "PS2";
    }

    @Override
    public String connectToInterface(String name) {
        return "Podłączono mysz przy użyciu interfejsu: " + name;
    }
}
