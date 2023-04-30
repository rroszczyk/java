package net.roszczyk.factory1;

public class NetworkCard extends ComputerPart {
    @Override
    public void doSomething() {
        System.out.println("Uruchamiam kartę sieciową");
    }

    @Override
    public String getDefaultInterface() {
        return "PCI";
    }

    @Override
    public String run(String name) {
        return "Inicjuję interfejs karty Sieciowej: " + name;
    }
}
