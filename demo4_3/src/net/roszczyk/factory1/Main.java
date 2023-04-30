package net.roszczyk.factory1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Factory factory = new Factory();
        List<ComputerPart> parts = new ArrayList<>();


        parts.add(factory.getComputerPartByName("video"));
        parts.add(factory.getComputerPartByName("network"));

        for (ComputerPart cp : parts) {
            cp.run(cp.getInterface());
            cp.doSomething();
        }
    }
}