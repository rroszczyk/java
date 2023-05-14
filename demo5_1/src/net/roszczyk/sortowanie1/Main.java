package net.roszczyk.sortowanie1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static <s1> void main(String[] args) {
        List<Student> Students = new ArrayList<>();

        Students.add(new Student("Jan", "Kowalski", "3425344"));
        Students.add(new Student("Piotr", "Malinowski", "453543"));
        Students.add(new Student("Barbara", "Piotrowicz", "45435345"));
        Students.add(new Student("Anna", "Zegadło", "54354543"));
        Students.add(new Student("Elżbieta", "Arabas", "345435435"));
        Students.add(new Student("Katarzyna", "Masłoń", "443543543"));
        Students.add(new Student("Wojciech", "Podolski", "45435"));

        Students.stream().forEach(System.out::println);

        System.out.println("******** WG IMIE ******");
        Collections.sort(Students);
        Students.stream().forEach(System.out::println);

        System.out.println("********* WG NAZWISKO ******");
        Collections.sort(Students, (s1, s2) -> s1.wgNazwiska(s2));
        Students.stream().forEach(System.out::println);

        System.out.println("********* WG INDEKSU ******");
        Collections.sort(Students, (s1, s2) -> s1.wgIndeksu(s2));
        Students.stream().forEach(System.out::println);

        System.out.println(("********* WH IMIENIA I NAZWISKA ********"));
    }
}