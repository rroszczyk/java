package net.roszczyk.sample4;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Student> kolejka = new PriorityQueue<>(Student.WgIndeksu());

        kolejka.offer(new Student("Anna", "Kowalska", 3325));
        kolejka.offer(new Student("Zbigniew", "Poniedziałek", 2133));
        kolejka.offer(new Student("Joanna", "Maj", 4432));
        kolejka.offer(new Student("Piotr", "Maj", 3344));
        kolejka.offer(new Student("Alicja", "Poniatowska", 5432));
        kolejka.offer(new Student("Alicja", "Pawłowicz", 3332));
        kolejka.offer(new Student("Paweł", "Włodarczyk", 2232));
        kolejka.offer(new Student("Marcin", "Stępień", 5555));
        kolejka.offer(new Student("Marcin", "Stępień", 4444));
        kolejka.offer(new Student("Albert", "Pietrzyk", 3323));

        System.out.println(kolejka);

        while (!kolejka.isEmpty()) {
            System.out.println(kolejka.poll());
        }
    }
}
