package net.roszczyk.sample1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();

        lista.add("Pies");
        lista.add("Kot");
        lista.add("Słoń");
        lista.add("Zebra");
        lista.add("Antylopa");
        lista.add("Bizon");
        lista.add("Bocian");
        lista.add("Małpa");

        System.out.println("******* Lista zwierząt **********");
        for (String l : lista) {
            System.out.println(l);
        }

        System.out.println("******* Lista zwierząt posortowana asc **********");
        Collections.sort(lista);
        lista.forEach(System.out::println);

        System.out.println("******* Lista zwierząt posortowana dsc **********");
        Collections.reverse(lista);
        lista.forEach(System.out::println);
    }
}