package net.roszczyk.sample2;

import java.util.Comparator;

public class WgIndeks implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.indeks - o2.indeks;
    }
}
