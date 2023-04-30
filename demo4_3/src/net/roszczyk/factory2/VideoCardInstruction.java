package net.roszczyk.factory2;

public class VideoCardInstruction implements FactoryInstruction {
    @Override
    public String getName() {
        return "video";
    }

    @Override
    public ComputerPart getInstance(Object... o) {
        if (o.length == 2) {
            if (o[1] instanceof Integer) {
                return new VideoCard((String) o[0], ((Integer)o[1]).toString());
            } else {
                return new VideoCard((String) o[0], (String)o[1]);
            }
        } else if (o.length == 1) {
            return new VideoCard((String) o[0], "");
        }
        return new VideoCard("Generic", "");
    }
}
