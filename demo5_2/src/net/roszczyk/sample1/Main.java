package net.roszczyk.sample1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> listaImion = new ArrayList<>();

        listaImion.add("Katarzyna");
        listaImion.add("Anna");
        listaImion.add("Patrycja");
        listaImion.add("Karol");
        listaImion.add("Piotr");
        listaImion.add("Antoni");
        listaImion.add("Zbigniew");

        System.out.println("*************** Imiona w kolejności przypadkowej **********");
        for (String imie : listaImion) {
            System.out.println(imie);
        }

        System.out.println("*************** Imiona w kolejności alfabetycznej **********");
        Collections.sort(listaImion);
        listaImion.stream().forEach(System.out::println);

        System.out.println("*************** Imiona w kolejności alfabetycznej odwróconej **********");
        Collections.reverse(listaImion);
        listaImion.stream().forEach(System.out::println);
    }
}