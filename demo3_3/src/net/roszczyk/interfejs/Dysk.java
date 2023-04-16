package net.roszczyk.interfejs;

public class Dysk implements USB, SATA {
    @Override
    public void connectSATA() {
        System.out.println("Inicjalizuję dysk na SATA");
    }

    @Override
    public void connectUSB() {
        System.out.println("Inicjalizuję dysk na USB");
    }
}
