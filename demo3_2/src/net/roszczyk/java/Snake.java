package net.roszczyk.java;

public class Snake
{
    private String Name;
    public Snake(String name)
    {
        Name = name;
    }
    public void SetName(String value) {
        if (value.length() < 10) {
            Name = value;
        } else {
            System.out.println("W ten sposób nie można nazwać węża");
        }
    }
    public String GetName() {
        return Name;
    }
}
