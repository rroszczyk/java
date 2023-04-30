package net.roszczyk.factory2;

public class NetworkCard extends ComputerPart {
    private String brand;
    public NetworkCard(String brand) {
        this.brand = brand;
    }
    @Override
    public void doSomething() {
        System.out.println("Uruchamiam kartę sieciową " + brand);
    }

    @Override
    public String getDefaultInterface() {
        return "PCI";
    }

    @Override
    public String run(String name) {
        return "Inicjuję interfejs karty Sieciowej: " + name + " " + brand;
    }
}
