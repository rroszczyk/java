package net.roszczyk.factory2;

public class KeyboardInstruction implements IPart {
    @Override
    public String getPartName() {
        return "keyboard";
    }

    @Override
    public Part getInstance() {
        return new Keyboard();
    }
}
