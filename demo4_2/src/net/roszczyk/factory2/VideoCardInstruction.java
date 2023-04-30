package net.roszczyk.factory2;

public class VideoCardInstruction implements InstructionComputerPart {
    @Override
    public String getComputerPartName() {
        return "video";
    }

    @Override
    public ComputerPart getInstance(Object... o) {
        return new VideoCard();
    }
}
