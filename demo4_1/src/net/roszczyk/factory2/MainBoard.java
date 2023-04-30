package net.roszczyk.factory2;

public class MainBoard extends Part implements IPart {
    @Override
    public String getPrimaryInterface() {
        return "brak";
    }

    @Override
    public String connectToInterface(String name) {
        return "Płyta główna ma wiele interfejsów do których podłączamy komponenty";
    }

    @Override
    public String getPartName() {
        return "mainboard";
    }

    @Override
    public Part getInstance() {
        return new MainBoard();
    }
}
