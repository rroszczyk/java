package net.roszczyk.factory2;

import java.util.HashMap;
import java.util.Map;

public class Factory {
    Map<String, IPart> instructions;

    public void addPartInstruction(IPart instruction) {
        instructions.put(instruction.getPartName(), instruction);
    }
    public Part getPartByName(String name) {
        IPart instruction = instructions.get(name);
        if (instruction != null) {
            return instruction.getInstance();
        } else {
            System.out.println("Nie mogę znaleźć instrukcji budowy komponentu: " + name);
            return null;
        }
    }
    public Factory() {
        instructions = new HashMap<>();
    }
}
