package net.roszczyk.factory2;

import java.util.HashMap;
import java.util.Map;

public class Factory {
    class InstructionComputerPartWithArgs
    {
        Object[] args;
        InstructionComputerPart instructionComputerPart;
        public InstructionComputerPartWithArgs(InstructionComputerPart icp, Object... o) {
            this.instructionComputerPart = icp;
            args = o;
        }
    }
    private Map<String, InstructionComputerPartWithArgs> instructions;
    public Factory() {
        instructions = new HashMap<>();
    }

    public void addInstruction(InstructionComputerPart instruction, Object... o) {
        instructions.put(instruction.getComputerPartName(), new InstructionComputerPartWithArgs(instruction, o));
    }

    public ComputerPart getComputerPartByName(String string) {
        InstructionComputerPartWithArgs instruction = instructions.get(string);

        if (instruction != null) {
            return instruction.instructionComputerPart.getInstance(instruction.args);
        }
        return null;
    }
}
