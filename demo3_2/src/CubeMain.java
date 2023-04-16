import net.roszczyk.java.Cube;

public class CubeMain {
    public static void main(String[] args)
    {
        Cube cube = new Cube(5);

        System.out.println("Sześcian o boku " + cube.getValue() +
                " ma objętość " + cube.getVolume());

        cube.setValue(3);

        System.out.println("Sześcian o boku " + cube.getValue() +
                " ma objętość " + cube.getVolume());

        cube.setValue(-3);

        System.out.println("Sześcian o boku " + cube.getValue() +
                " ma objętość " + cube.getVolume());
    }
}
