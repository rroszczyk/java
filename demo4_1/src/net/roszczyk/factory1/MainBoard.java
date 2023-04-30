package net.roszczyk.factory1;

public class MainBoard extends Part {
    @Override
    public String getPrimaryInterface() {
        return "brak";
    }

    @Override
    public String connectToInterface(String name) {
        return "płyta główna ma wiele interfejsów";
    }
}
