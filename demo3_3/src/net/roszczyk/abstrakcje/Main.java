package net.roszczyk.abstrakcje;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)
            throws IOException
    {
        Game game;
        List<Game> kolekcjaGier = new ArrayList<>();

        game = new Wiedzmin("000001");
        kolekcjaGier.add(game);

        kolekcjaGier.add(new Wiedzmin("000002"));
        kolekcjaGier.add(new Wiedzmin("000003"));
        kolekcjaGier.add(new GTA("35FSC-45GV4-GVH65"));

        for (Game g : kolekcjaGier) {
            System.out.println(g);
        }

        FileOutputStream fos = new FileOutputStream("games.bin");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(kolekcjaGier);
    }
}