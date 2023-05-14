package net.roszczyk.sample5;

public class Uczen extends Student implements Comparable<Uczen>
{
    public Uczen(String imie, String nazwisko, Integer indeks) {
        super(imie, nazwisko, indeks);
    }
    @Override
    public int compareTo(Uczen o) {
        int value = imie.compareTo(o.imie);
        if (value != 0) return value;
        return nazwisko.compareTo(o.nazwisko);
    }
}
