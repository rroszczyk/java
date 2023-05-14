package net.roszczyk.sample5;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>(new SortWgNazwisko());

        pq.offer(new Student("Katarzyna", "Malinowska", 4543));
        pq.offer(new Student("Anna", "Kowalska", 3525));
        pq.offer(new Student("Jan", "Olbracht", 4436));
        pq.offer(new Student("Piotr", "Lubaszka", 4442));
        pq.offer(new Student("Paweł", "Lubaszka", 2232));
        pq.offer(new Student("Katarzyna", "Iksińska", 3345));
        pq.offer(new Student("Maurycy", "Poniedzielski", 3455));
        pq.offer(new Student("Alicja", "Pawłowska", 4435));

        System.out.println(pq);

        List<Uczen> uczniowie = pq.stream().map(s -> new Uczen(s.imie, s.nazwisko, s.indeks)).collect(Collectors.toList());
        PriorityQueue<Uczen> pq1 = new PriorityQueue<>(uczniowie);

        System.out.println("*** Kolejka studentów ***");
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }

        System.out.println("*** Kolejka uczniów ***");
        while (!pq1.isEmpty()) {
            System.out.println(pq1.poll());
        }
    }
}
