package net.roszczyk.pojazdy;

import java.util.Random;

public class Osobowy extends Pojazd {
    public Osobowy(String kolor, Integer predkosc, Integer liczbaDrzwi){
        super(kolor, predkosc);

        Random random = new Random();

        random.nextInt(100);
    }
}
