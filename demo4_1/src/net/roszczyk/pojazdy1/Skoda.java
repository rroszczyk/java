package net.roszczyk.pojazdy1;

public class Skoda extends Pojazd {
    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
