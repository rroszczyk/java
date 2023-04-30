package net.roszczyk.factory1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public Part getPartByName(String name) {
        if (name.contains("disc"))
            return new Disc();
        if (name.contains("mainboard"))
            return new MainBoard();
        if (name.contains("memory"))
            return new Memory();
        return null;
    }
    public static void main(String[] args) {
        Main program = new Main();
        List<Part> parts = new ArrayList<>();

        parts.add(program.getPartByName("mainboard"));
        parts.add(program.getPartByName("memory"));
        parts.add(program.getPartByName("disc"));

        for (Part p : parts)
        {
            p.connectToInterface(p.getPrimaryInterface());
        }
     }
}