package net.roszczyk.factory2;

public class NetworkCardInstruction implements InstructionComputerPart {
    @Override
    public String getComputerPartName() {
        return "network";
    }

    @Override
    public ComputerPart getInstance(Object... o) {
        return new NetworkCard((String)o[0]);
    }
}
