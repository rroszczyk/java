import net.roszczyk.animal.*;

import java.util.ArrayList;
import java.util.List;

public class AnimalMain
{
    public static void main(String[] args)
    {
        List<Elephant> enclosure = new ArrayList<>();
        List<Snake> terarrium = new ArrayList<>();
        Elephant elephant;
        Snake snake;

        elephant = new Elephant();
        elephant.setName("Bolek");
        enclosure.add(elephant);

        elephant = new Elephant();
        elephant.setName("Krysia");
        enclosure.add(elephant);

        snake = new Snake();
        snake.setName("Tosia");
        terarrium.add(snake);

        for (Elephant e: enclosure) {
            System.out.println(e.getName());
        }

        for (Snake s: terarrium) {
            System.out.println(s.getName());
        }
    }
}