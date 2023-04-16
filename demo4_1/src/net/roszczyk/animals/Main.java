package net.roszczyk.animals;

import net.roszczyk.animals.Animal;
import net.roszczyk.animals.Dog;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog();

        Carnivore carnivore = (Carnivore)animal;

        animal.setName("Burek");
        System.out.println(animal.getName());

        carnivore.eatMeat();

    }
}