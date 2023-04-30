package net.roszczyk.factory2;

public class NetworkCardInstruction implements FactoryInstruction {
    @Override
    public String getName() {
        return "network";
    }

    @Override
    public ComputerPart getInstance(Object... o) throws Exception {
        if (o.length == 1) {
            if (o[0] instanceof Integer) {
                return new NetworkCard((Integer) o[0]);
            } else {
                throw new Exception("dla karty sieciowej drugi parametr musi być liczbą");
            }
        } else {
            return new NetworkCard(100);
        }
    }
}
