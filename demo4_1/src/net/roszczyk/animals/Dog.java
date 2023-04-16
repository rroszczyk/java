package net.roszczyk.animals;

public class Dog extends Animal implements Carnivore {
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
        System.out.println("szczeka");
    }

    @Override
    public void eatMeat() {
        System.out.println("je mięso");
    }
}
