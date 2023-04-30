package net.roszczyk.factory1;

public class VideoCard extends ComputerPart {
    @Override
    public void doSomething() {
        System.out.println("Karta video wyświetla treść");
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
