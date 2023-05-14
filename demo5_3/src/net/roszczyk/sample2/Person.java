package net.roszczyk.sample2;

public class Person {
    public String imie;
    public String nazwisko;

    public Person(String imie, String nazwisko)
    {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    @Override
    public String toString() {
        return "[N: " + nazwisko + "I: " + imie + "]";
    }
}
