package net.roszczyk.factory2;

public class NetworkCard extends ComputerPart {
    Integer interruptNo;
    public NetworkCard(Integer interruptNo) {
        this.interruptNo = interruptNo;
    }
    @Override
    public void doSomething() {
        System.out.println("Karta sieciowa przesyła dane - numer przerwania " + interruptNo.toString());
    }

    @Override
    public String getInterface() {
        return "PCI";
    }

    @Override
    public void run(String intf) {
        System.out.println("Karta uruchamia się na interfejsie " + intf);
    }
}
