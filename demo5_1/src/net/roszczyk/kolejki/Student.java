package net.roszczyk.kolejki;

public class Student implements Comparable<Student> {
    private String _imie;
    private String _nazwisko;
    private String _indeks;

    public Student(String imie, String nazwisko, String indeks)
    {
        _imie = imie;
        _nazwisko = nazwisko;
        _indeks = indeks;
    }

    public String getImie() {
        return _imie;
    }

    public String getNazwisko() {
        return _nazwisko;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(_imie);
        sb.append(" ");
        sb.append(_nazwisko);
        sb.append(": ");
        sb.append(_indeks);

        // String napis = _imie + " " + _nazwisko + ": " + _indeks;

        return sb.toString();
    }

    @Override
    public int compareTo(Student o) {
        int order = _imie.compareTo(o._imie);
        if (order != 0) return order;
        return _nazwisko.compareTo(o._nazwisko);
    }
}
