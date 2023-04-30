package net.roszczyk.factory2;

public interface FactoryInstruction {
    String getName();
    ComputerPart getInstance(Object... o) throws Exception;
}
