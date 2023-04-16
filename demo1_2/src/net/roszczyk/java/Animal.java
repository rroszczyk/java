package net.roszczyk.java;

public class Animal
{
    private String Name;
    protected String AnimalName;
    public void SetName(String value)
    {
        if (value.length() <= 10) {
            this.Name = value;
        } else {
            System.out.println("Nazwa jest za długa");
        }
    }
    public String GetName()
    {
        return this.AnimalName + " " + this.Name;
    }
    public String Eat()
    {
        return "zwierze jest głodne";
    }
}
