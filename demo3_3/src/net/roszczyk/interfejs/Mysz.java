package net.roszczyk.interfejs;

public class Mysz extends HID implements USB {
    @Override
    public void connectUSB() {
        System.out.println("Inicjalizuję mysz na USB");
    }
}
