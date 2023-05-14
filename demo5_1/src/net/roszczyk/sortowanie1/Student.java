package net.roszczyk.sortowanie1;

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

    public String getIimie() {
        return _imie;
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
    public int compareTo(Student student) {
        return _imie.compareTo(student._imie);
    }

    public int wgNazwiska(Student student) {
        return _nazwisko.compareTo(student._nazwisko);
    }

    public int wgIndeksu(Student student) {
        return _indeks.length() - student._indeks.length();
    }
}
