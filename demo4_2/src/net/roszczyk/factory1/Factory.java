package net.roszczyk.factory1;

public class Factory {
    ComputerPart getComputerPartByName(String name) {
        if (name.contains("video"))
            return new VideoCard();

        if (name.contains("network"))
            return new NetworkCard();

        return null;
    }
}
