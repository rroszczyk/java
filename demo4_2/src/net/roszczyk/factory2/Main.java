package net.roszczyk.factory2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();
        ComputerPart cp;
        List<ComputerPart> parts = new ArrayList<>();

        factory.addInstruction(new NetworkCardInstruction(), "intel", "coś", 7, 43);
        factory.addInstruction(new VideoCardInstruction());
        factory.addInstruction(new HardDisc());

        cp = factory.getComputerPartByName("network");
        if (cp != null) {
            parts.add(cp);
        }
        cp = factory.getComputerPartByName("network");
        if (cp != null) {
            parts.add(cp);
        }
        cp = factory.getComputerPartByName("video");
        if (cp != null) {
            parts.add(cp);
        }
        cp = factory.getComputerPartByName("harddisc");
        if (cp != null) {
            parts.add(cp);
        }

        for (ComputerPart c : parts) {
            System.out.println(c.run(c.getDefaultInterface()));
        }
    }

}
