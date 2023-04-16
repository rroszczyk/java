package net.roszczyk.pojazdy1;

public class Pojazdy1Main {
    public static void main(String[] args) {
        Pojazd pojazd = new Skoda();

        pojazd.setName("Skoda Fabia");
        System.out.println(pojazd.getName());
    }
}