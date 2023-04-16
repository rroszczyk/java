package net.roszczyk.animal;

public class Animal {
    private String Name;
    protected String AnimalName;

    public void setName(String name) {
        this.Name = name;
    }

    public String getName() {
        return this.AnimalName + ": " + this.Name;
    }
}
