package net.roszczyk.animals;

import java.io.Serializable;

public class Fish extends Animal implements Carnivore, Serializable  {
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
        System.out.println("bulgocze");
    }

    @Override
    public void eatMeat() {
        System.out.println("je robaki");
    }
}
