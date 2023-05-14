package net.roszczyk.sample4;

import java.util.Comparator;

public class WgImie implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        int value = s1.imie.compareTo(s2.imie);
        if (value != 0) return value;
        return s1.nazwisko.compareTo(s2.nazwisko);
    }
}
