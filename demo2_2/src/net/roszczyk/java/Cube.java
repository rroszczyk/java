package net.roszczyk.java;

public class Cube
{
    private Integer _value;

    public Cube(int value)
    {
        this._value = value;
    }

    public void SetValue(int value) {
        if (value > 0 && value < 100) {
            this._value = value;
        } else {
            System.out.println("Nieprawidłowa długość boku");
        }
    }

    public int GetValue()
    {
        return this._value;
    }

    public int GetVolume()
    {
        return this._value * this._value * this._value;
    }

}
