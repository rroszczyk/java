package net.roszczyk.sample5;

public class Student {
    public String imie;
    public String nazwisko;
    public Integer indeks;

    public Student(String imie, String nazwisko, Integer indeks) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.indeks = indeks;
    }

    @Override
    public String toString() {
        //String value = imie + " " + nazwisko + ": " + indeks.toString();
        StringBuilder sb = new StringBuilder();

        sb.append(imie);
        sb.append(" ");
        sb.append(nazwisko);
        sb.append(": ");
        sb.append(indeks);

        return sb.toString();
    }
}
