package net.roszczyk.sample3;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        Deque<String> kolejka = new ArrayDeque<>();

        kolejka.add("Zosia");
        kolejka.add("Anatol");
        kolejka.add("Paulina");

        System.out.println("************** kolejka FIFO **************");
        System.out.println(kolejka);
        while (!kolejka.isEmpty()) {
            System.out.println("Obługuję: " + kolejka.pop());
            System.out.println(kolejka);
        }

        kolejka.add("Zosia");
        kolejka.add("Anatol");
        kolejka.add("Paulina");
        kolejka.push("Cwaniaczek");

        System.out.println("************** kolejka mieszana **************");
        System.out.println(kolejka);
        while (!kolejka.isEmpty()) {
            System.out.println("Obługuję: " + kolejka.pop());
            System.out.println(kolejka);
        }

        kolejka.push("Zosia");
        kolejka.push("Anatol");
        kolejka.push("Paulina");
        System.out.println("************** kolejka LIFO **************");
        System.out.println(kolejka);
        while (!kolejka.isEmpty()) {
            System.out.println("Obługuję: " + kolejka.pop());
            System.out.println(kolejka);
        }
    }
}
