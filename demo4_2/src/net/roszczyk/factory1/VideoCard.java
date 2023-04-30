package net.roszczyk.factory1;

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
        return "Inicjiuję interfejs karty Video: " + name;
    }
}
