import net.roszczyk.java.*;
public class ElephantMain
{
    public static void main(String[] args)
    {
        Elephant elephant = new Elephant("Bolek");

        System.out.println(elephant.GetName());

        elephant.SetName("Tosia");

        System.out.println(elephant.GetName());

        elephant.SetName("Ala Ma Kota i Psa");

        System.out.println(elephant.GetName());
    }
}