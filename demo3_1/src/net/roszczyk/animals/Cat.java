package net.roszczyk.animals;

import java.io.Serializable;

public class Cat extends Animal implements Carnivore, Serializable {
    @Override
    public void setName(String value) {
        this.name = value;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void Sound() {
        System.out.println("miauczy");
    }

    @Override
    public void eatMeat() {
        System.out.println("pije mleko");
    }
}
