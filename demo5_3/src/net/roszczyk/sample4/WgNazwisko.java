package net.roszczyk.sample4;

import java.util.Comparator;

public class WgNazwisko implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        int value = o1.nazwisko.compareTo(o2.nazwisko);
        if (value != 0) return value;
        return o1.imie.compareTo(o2.imie);
    }
}
