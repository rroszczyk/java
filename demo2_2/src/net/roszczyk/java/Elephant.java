package net.roszczyk.java;
public class Elephant
{
    private String Name;
    public Elephant(String name) {
        this.Name = name;
    }

    public String GetName() {
        return this.Name;
    }

    public void SetName(String value)
    {
        if (value.length() <= 10) {
            this.Name = value;
        } else {
            System.out.println("Tak nie można nazwać słonia");
        }
    }
}
