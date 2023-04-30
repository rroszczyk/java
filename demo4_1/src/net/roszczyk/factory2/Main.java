package net.roszczyk.factory2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();

        factory.addPartInstruction(new MainBoard());
        factory.addPartInstruction(new Disc());
        factory.addPartInstruction(new MemoryInstruction());

        List<Part> parts = new ArrayList<>();

        parts.add(factory.getPartByName("mainboard"));
        parts.add(factory.getPartByName("disc"));
        parts.add(factory.getPartByName("memory"));

        for (Part part : parts) {
            if (part != null) {
                System.out.println(part.connectToInterface(part.getPrimaryInterface()));
            }
        }
    }
}