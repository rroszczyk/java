import net.roszczyk.animal.*;

import java.util.ArrayList;
import java.util.List;

public class ZooMain
{
    public static void main(String[] args)
    {
        List<Animal> animals = new ArrayList<>();
        Animal animal;

        animal = new Elephant();
        animal.setName("Bolek");
        animals.add(animal);

        animal = new Elephant();
        animal.setName("Krysia");
        animals.add(animal);

        animal = new Snake();
        animal.setName("Tosia");
        animals.add(animal);

        animal = new Camel();
        animal.setName("Stefan");
        animals.add(animal);

        for (Animal a: animals) {
            System.out.println(a.getName());
        }
    }
}