package net.roszczyk.animals;

import net.roszczyk.animals.Animal;
import net.roszczyk.animals.Dog;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args)
            throws IOException
    {

        List<Animal> zoo = new LinkedList<Animal>();
        Animal animal;

        animal = new Dog();
        animal.setName("Burek");
        zoo.add(animal);

        animal = new Cat();
        animal.setName("Mruczek");
        zoo.add(animal);

        animal = new Fish();
        animal.setName("Złotka");
        zoo.add(animal);

        FileOutputStream fos = new FileOutputStream("zoo.bin");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(zoo);
    }
}