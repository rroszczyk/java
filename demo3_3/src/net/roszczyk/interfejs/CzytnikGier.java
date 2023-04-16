package net.roszczyk.interfejs;

import net.roszczyk.abstrakcje.Game;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class CzytnikGier {
    public static void main(String[] args)
            throws IOException, ClassNotFoundException
    {
        FileInputStream fis = new FileInputStream("games.bin");
        ObjectInputStream ois = new ObjectInputStream(fis);
        List<Game> kolekcjaGier = (List<Game>)ois.readObject();

        for (Game g : kolekcjaGier) {
            System.out.println(g);
        }
    }
}
