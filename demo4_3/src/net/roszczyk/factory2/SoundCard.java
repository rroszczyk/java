package net.roszczyk.factory2;

public class SoundCard extends ComputerPart implements FactoryInstruction {
    @Override
    public void doSomething() {
        System.out.println("Karta dźwiękowa gra");
    }

    @Override
    public String getInterface() {
        return "USB";
    }

    @Override
    public void run(String intf) {
        System.out.println("Karta dźwiękowa inicjalizuje się na interfejsie " + intf);
    }

    @Override
    public String getName() {
        return "sound";
    }

    @Override
    public ComputerPart getInstance(Object... o) {
        return new SoundCard();
    }
}
