package net.roszczyk.factory2;

public interface InstructionComputerPart {
    String getComputerPartName();
    ComputerPart getInstance(Object... o);
}
