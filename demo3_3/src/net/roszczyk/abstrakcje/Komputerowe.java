package net.roszczyk.abstrakcje;

public abstract class Komputerowe extends Game {
    @Override
    public String getName() {
        return this.name;
    }
    @Override
    public void setName(String name) {
        this.name = name;
    }
}
