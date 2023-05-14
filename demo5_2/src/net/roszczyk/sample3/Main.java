package net.roszczyk.sample3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public void run() {
        List<Student> studenci = new ArrayList<>();

        studenci.add(new Student("Katarzyna", "Malinowska", 4543));
        studenci.add(new Student("Anna", "Kowalska", 3525));
        studenci.add(new Student("Jan", "Olbracht", 4436));
        studenci.add(new Student("Piotr", "Lubaszka", 4442));
        studenci.add(new Student("Paweł", "Lubaszka", 2232));
        studenci.add(new Student("Katarzyna", "Iksińska", 3345));
        studenci.add(new Student("Maurycy", "Poniedzielski", 3455));
        studenci.add(new Student("Alicja", "Pawłowska", 4435));

        System.out.println("*********** Lista studentów przypadkowa kolejność");
        studenci.forEach(System.out::println);

        System.out.println("*********** Lista studentów wg nazwiska ***********");
        Collections.sort(studenci, new SortWgNazwisko());
        studenci.forEach(System.out::println);
        studenci.stream().map(s -> s.nazwisko).forEach(System.out::println);

        System.out.println("*********** Lista studentów we imienia ***********");
        Collections.sort(studenci, new SortWgImie());
        studenci.forEach(System.out::println);

        System.out.println("*********** Lista studentów wg indeksu ***********");
        Collections.sort(studenci, new SortWgIndeks());
        studenci.forEach(System.out::println);
    }
    public static void main(String[] args) {
        Main prg = new Main();
        prg.run();
    }
}
