package net.roszczyk.factory1;
public class Main {
    public Part getPartByName(String name) {
        if (name.contains("disc"))
            return new Disc();
        if (name.contains("mainboard"))
            return new MainBoard();
        if (name.contains("memory"))
            return new Memory();
        return null;
    }
    public static void main(String[] args) {
        Main program = new Main();

        Part part = program.getPartByName("mainboard");

        System.out.println(part.getPrimaryInterface());
        System.out.println(part.connectToInterface("sata"));
    }
}