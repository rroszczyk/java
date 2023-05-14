package net.roszczyk.sample4;

import java.util.Comparator;

public class Student implements Comparable<Student> {
    public String imie;
    public String nazwisko;
    public Integer indeks;

    public String getHash() {
        return (nazwisko + imie + indeks.toString()).toLowerCase();
    }

    public Student(String imie, String nazwisko, Integer indeks)
    {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.indeks = indeks;
    }

    @Override
    public String toString() {
        //String value = nazwisko + " " + imie + ": " + indeks;
        StringBuilder sb = new StringBuilder();

        sb.append(nazwisko);
        sb.append(" ");
        sb.append(imie);
        sb.append(": ");
        sb.append(indeks);
        return sb.toString();
    }

    @Override
    public int compareTo(Student o) {
        return this.getHash().compareTo(o.getHash());
    }

    public static Comparator<Student> WgIndeksu() {
        return (o1, o2) -> o1.indeks - o2.indeks;
    }
}
