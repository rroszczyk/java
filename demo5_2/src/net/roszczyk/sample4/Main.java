package net.roszczyk.sample4;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        Deque<String> kolejka = new ArrayDeque<>();

        System.out.println("***** Kolejka FIFO");

        kolejka.add("Alicja");
        kolejka.add("Piotr");
        kolejka.add("Anna");

        System.out.println(kolejka);

        while (!kolejka.isEmpty()) {
            System.out.println("> " + kolejka.pop());
        }

        System.out.println("***** Kolejka mieszaną");

        kolejka.add("Ilona");
        kolejka.add("Marek");
        kolejka.add("Szymon");

        System.out.println(kolejka);

        kolejka.push("Cwaniaczek");

        System.out.println(kolejka);

        while (!kolejka.isEmpty()) {
            System.out.println("> " + kolejka.pop());
        }

        System.out.println("***** Kolejka LIFO");

        kolejka.push("Ilona");
        kolejka.push("Marek");
        kolejka.push("Szymon");

        System.out.println(kolejka);
    }
}
