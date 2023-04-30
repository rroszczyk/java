package net.roszczyk.factory2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void demo()
    {
        Map<String, String> translator = new HashMap<>();

        translator.put("cat", "kot");
        translator.put("dog", "pies");
        translator.put("fish", "ryba");

        for (String key : translator.keySet()) {
            System.err.println("ang: " + key + " pol: " + translator.get(key));
        }
    }
    public void run() throws Exception
    {
        Factory factory = new Factory();
        ComputerPart cp;
        List<ComputerPart> computerParts = new ArrayList<>();

        factory.addInstruction(new VideoCardInstruction());
        factory.addInstruction(new NetworkCardInstruction());
        factory.addInstruction(new SoundCard());

        cp = factory.getComputerPartByName("network", 99);
        if (cp != null) {
            computerParts.add(cp);
        }
        cp = factory.getComputerPartByName("video", "Nvidia", "4090");
        if (cp != null) {
            computerParts.add(cp);
        }
        cp = factory.getComputerPartByName("video", "AMD", 1000);
        if (cp != null) {
            computerParts.add(cp);
        }
        cp = factory.getComputerPartByName("video", "Intel", "HD Graphics");
        if (cp != null) {
            computerParts.add(cp);
        }
        cp = factory.getComputerPartByName("video");
        if (cp != null) {
            computerParts.add(cp);
        }
        cp = factory.getComputerPartByName("sound");
        if (cp != null) {
            computerParts.add(cp);
        }

        for (ComputerPart c : computerParts) {
            c.run(c.getInterface());
            c.doSomething();
        }
    }
    public static void main(String[] args) {
        try {
            Main prg = new Main();

            prg.run();
        }
        catch (Exception e) {
            System.err.println("BŁĄD: " + e.getMessage());
        }
    }
}
