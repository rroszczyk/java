package net.roszczyk.interfejs;

public class Klawiatura extends HID implements PS2, USB {
    @Override
    public void connectPS2() {
        System.out.println("Inicjalizuję klawiaturę na PS2");
    }

    @Override
    public void connectUSB() {
        System.out.println("Inicjalizuję klawiaturę na USB");
    }
}
