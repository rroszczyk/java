package net.roszczyk.factory2;

import java.util.HashMap;
import java.util.Map;

public class Factory {
    Map<String, FactoryInstruction> instructions;

    public Factory()
    {
        instructions = new HashMap<>();
    }

    void addInstruction(FactoryInstruction instruction) {
        instructions.put(instruction.getName(), instruction);
    }

    ComputerPart getComputerPartByName(String name, Object... o) throws Exception {
        FactoryInstruction instruction = instructions.get(name);
        if (instruction != null) {
            return instruction.getInstance(o);
        }
        return null;
    }
}
