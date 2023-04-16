package net.roszczyk.java;

public class Cube
{
    private Integer value;
    public Cube(Integer aValue)
    {
        value = aValue;
    }
    public void setValue(Integer value) {
        if ((value > 0) && (value <= 1000)) {
            this.value = value;
        } else {
            System.out.println("Długość boku poza zakresem");
        }
    }
    public Integer getValue() {
        return value;
    }
    public Integer getVolume() {
        return value * value * value;
    }
}
