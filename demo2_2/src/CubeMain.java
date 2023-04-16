import net.roszczyk.java.Cube;

public class CubeMain {
    public static void main(String[] args)
    {
        Cube cube = new Cube(5);

        System.out.println("Sześcian o boku: " + cube.GetValue()
        + " ma objętość " + cube.GetVolume());

        cube.SetValue(-3);

        cube.SetValue(3);

        System.out.println("Sześcian o boku: " + cube.GetValue()
                + " ma objętość " + cube.GetVolume());
    }
}