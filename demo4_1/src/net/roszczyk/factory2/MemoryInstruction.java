package net.roszczyk.factory2;

public class MemoryInstruction implements IPart {
    @Override
    public String getPartName() {
        return "memory";
    }

    @Override
    public Part getInstance() {
        return new Memory();
    }
}
