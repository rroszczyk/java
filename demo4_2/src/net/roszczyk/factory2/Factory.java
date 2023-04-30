package net.roszczyk.factory2;

import java.util.HashMap;
import java.util.Map;

public class Factory {
    private Map<String, InstructionComputerPart> instructions;

    public Factory() {
        instructions = new HashMap<>();
    }

    public void addInstruction(InstructionComputerPart instruction) {
        instructions.put(instruction.getComputerPartName(), instruction);
    }

    public ComputerPart getComputerPartByName(String string) {
        InstructionComputerPart instruction = instructions.get(string);

        if (instruction != null) {
            return instruction.getInstance();
        }
        return null;
    }
}
