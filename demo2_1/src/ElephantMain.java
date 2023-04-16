import net.roszczyk.java.*;
public class ElephantMain
{
    public static void main(String[] args)
    {
        Elephant tolek = new Elephant();
        Elephant bambo = new Elephant();
        Lion samba = new Lion();

        tolek.SetName("Tolek");
        bambo.SetName("Bambo");
        samba.SetName("Samba");

        System.out.println(tolek.GetName());
        System.out.println(bambo.GetName());
        System.out.println(samba.GetName());
    }
}
