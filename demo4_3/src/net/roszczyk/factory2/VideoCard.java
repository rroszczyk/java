package net.roszczyk.factory2;

public class VideoCard extends ComputerPart {
    private String manufacturer;
    public VideoCard(String manufacturer, String model){
        this.manufacturer = manufacturer + " " + model;
    }
    @Override
    public void doSomething() {
        System.out.println("Karta " + this.manufacturer + " video wyświetla treść");
    }

    @Override
    public String getInterface() {
        return "PCI";
    }

    @Override
    public void run(String intf) {
        System.out.println("Karta " + this.manufacturer + " uruchamia się na interfejsie " + intf);
    }
}
