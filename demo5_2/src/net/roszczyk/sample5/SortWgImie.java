package net.roszczyk.sample5;

import java.util.Comparator;

public class SortWgImie implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        int value = o1.imie.compareTo(o2.imie);
        if (value != 0) return value;
        return o1.nazwisko.compareTo(o2.nazwisko);
    }
}
