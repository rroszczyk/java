package net.roszczyk.factory2;

public class VideoCard extends ComputerPart {
    @Override
    public void doSomething() {
        System.out.println("Uruchamiam kartę Video");
    }

    @Override
    public String getDefaultInterface() {
        return "PCI";
    }

    @Override
    public String run(String name) {
        return "Inicjuję interfejs karty Video: " + name;
    }
}
