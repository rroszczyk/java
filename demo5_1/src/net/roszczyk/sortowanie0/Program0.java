package net.roszczyk.sortowanie0;

import javax.imageio.stream.IIOByteBuffer;
import java.util.*;
import java.util.concurrent.DelayQueue;

public class Program0 {
    public static void main(String[] args)
    {
        List<String> Imiona = new ArrayList<>();

        Imiona.add("Kasia");
        Imiona.add("Basia");
        Imiona.add("Zosia");
        Imiona.add("Krzysiek");
        Imiona.add("Maria");
        Imiona.add("Jan");

        for (String imie : Imiona) {
            System.out.println(imie);
        }

        System.out.println("************** POSORTOWANE IMIONA ******************");

        Collections.sort(Imiona);
        for (String imie : Imiona) {
            System.out.println(imie);
        }

        System.out.println("************** POSORTOWANE ODWROTNIE  ******************");

        Collections.reverse(Imiona);
        Imiona.stream().forEach(System.out::println);

        System.out.println("************** KOLEJKA  ******************");

        Deque<String> Kolejka = new ArrayDeque<>();

        Kolejka.add("Kasia");
        Kolejka.add("Basia");
        Kolejka.add("Ala");
        Kolejka.add("Zosia");

        System.out.println(Kolejka);
        Kolejka.pop();
        System.out.println(Kolejka);
        Kolejka.push("Cwaniaczek");
        System.out.println(Kolejka);

        Deque<String> LIFO = new ArrayDeque<>();
        LIFO.push("Kasia");
        LIFO.push("Basia");
        LIFO.push("Ala");
        LIFO.push("Zosia");

        System.out.println(LIFO);
    }
}