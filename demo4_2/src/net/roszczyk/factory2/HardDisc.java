package net.roszczyk.factory2;

public class HardDisc extends ComputerPart implements InstructionComputerPart {
    @Override
    public void doSomething() {
        System.out.println("Inicjuje dysk twardy");
    }

    @Override
    public String getDefaultInterface() {
        return "sata";
    }

    @Override
    public String run(String name) {
        return "Przesyłam dane poprzez interfejs " + name;
    }

    @Override
    public String getComputerPartName() {
        return "harddisc";
    }

    @Override
    public ComputerPart getInstance(Object... o) {
        return new HardDisc();
    }
}
