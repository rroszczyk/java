import net.roszczyk.java.Animal;
import net.roszczyk.java.Eagle;
import net.roszczyk.java.Elephant;

import java.util.ArrayList;
import java.util.List;

public class AnimalsMain
{
        public static void main(String[] args)
        {
            List<Animal> Animals = new ArrayList<>();
            Animal animal;

            animal = new Elephant();
            animal.SetName("Bolek");
            Animals.add(animal);

            animal = new Elephant();
            animal.SetName("Lolek");
            Animals.add(animal);

            animal = new Eagle();
            animal.SetName("Biały");
            Animals.add(animal);

            System.out.println("Zwierzęta w ZOO:");
            for (Animal a : Animals) {
                System.out.println("\t" + a.GetName());
                System.out.println("\t" + a.Eat());
            }
        }
}