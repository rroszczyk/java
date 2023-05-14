package net.roszczyk.sample2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Student> studenci = new ArrayList<>();

        studenci.add(new Student("Anna", "Kowalska", 3325));
        studenci.add(new Student("Zbigniew", "Poniedziałek", 2133));
        studenci.add(new Student("Joanna", "Maj", 4432));
        studenci.add(new Student("Piotr", "Maj", 3344));
        studenci.add(new Student("Alicja", "Poniatowska", 5432));
        studenci.add(new Student("Alicja", "Pawłowicz", 3332));
        studenci.add(new Student("Paweł", "Włodarczyk", 2232));
        studenci.add(new Student("Marcin", "Stępień", 5555));
        studenci.add(new Student("Marcin", "Stępień", 4444));
        studenci.add(new Student("Albert", "Pietrzyk", 3323));

        System.out.println("***************** Studenci");
        studenci.forEach(System.out::println);

        System.out.println("***************** Studenci wg Imie");
        Collections.sort(studenci, new WgImie());
        studenci.forEach(System.out::println);

        System.out.println("***************** Studenci wg Indeks");
        Collections.sort(studenci, new WgIndeks());
        studenci.forEach(System.out::println);

        System.out.println("***************** Studenci wg Nazwisko");
        Collections.sort(studenci, new WgNazwisko());
        studenci.forEach(System.out::println);

        System.out.println("***************** Studenci wg Nazwisko");
        Collections.sort(studenci);
        studenci.stream().map(s -> s.nazwisko).forEach(System.out::println);

        List<Person> osoby = studenci.stream().map(s -> new Person(s.imie, s.nazwisko)).collect(Collectors.toList());
        osoby.forEach(System.out::println);
    }
}

