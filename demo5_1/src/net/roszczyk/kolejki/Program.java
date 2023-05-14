package net.roszczyk.kolejki;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Program {
    public static <s1> void main(String[] args)
    {
        Comparator<Student> wgNazwiska = (s1, s2) -> {
            int order = s1.getNazwisko().compareTo(s2.getNazwisko());
            if (order != 0) return order;
            return s1.getImie().compareTo(s2.getNazwisko());
        };

        PriorityQueue<Student> pq = new PriorityQueue<>(wgNazwiska);

        pq.offer(new Student("Jan", "Kowalski", "3425344"));
        pq.offer(new Student("Piotr", "Malinowski", "453543"));
        pq.offer(new Student("Elżbieta", "Kowalik", "345435435"));
        pq.offer(new Student("Elżbieta", "Arabas", "345435435"));
        pq.offer(new Student("Anna", "Zegadło", "54354543"));
        pq.offer(new Student("Barbara", "Piotrowicz", "45435345"));
        pq.offer(new Student("Katarzyna", "Masłoń", "443543543"));
        pq.offer(new Student("Wojciech", "Podolski", "45435"));

        System.out.println(pq);

        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}
