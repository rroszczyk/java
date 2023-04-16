import net.roszczyk.animal.*;

import java.lang.reflect.Type;
import java.util.ArrayList;

public class ZooMain {
    public static void main(String[] args) {
        Animal animal;
        ArrayList<Animal> animals = new ArrayList<>();

        animal = new Snake();
        animal.setName("Czarli");
        animals.add(animal);

        animal = new Snake();
        animal.setName("Benek");
        animals.add(animal);

        animal = new Elephant();
        animal.setName("Teodor");
        animals.add(animal);

        animal = new Elephant();
        animal.setName("Bambo");
        animals.add(animal);

        animal = new Cat();
        animal.setName("Burek");
        animals.add(animal);

        for (Animal a : animals) {
            System.out.println(a.getName());
        }
    }
}
