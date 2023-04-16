package net.roszczyk.animals;

import net.roszczyk.students.Student;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class WczytajZoo
{
    public static void main(String[] args)
            throws IOException, ClassNotFoundException {

        List<Animal> zoo = new LinkedList<Animal>();

        FileInputStream fis = new FileInputStream("zoo.bin");
        ObjectInputStream ois = new ObjectInputStream(fis);

        zoo = (List<Animal>) ois.readObject();

        for (Animal a : zoo) {
            System.out.println(a.getClass() + " " + a.getName());
            List<Class<?>> interfaces = Arrays.asList(a.getClass().getInterfaces());
            if (interfaces.contains(Carnivore.class)) {
                ((Carnivore)a).eatMeat();
            }
        }
    }
}
