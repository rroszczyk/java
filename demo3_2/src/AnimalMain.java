import net.roszczyk.animal.*;
import java.util.ArrayList;

public class AnimalMain {
    public static void main(String[] args) {
        Snake snake;
        Elephant elephant;
        ArrayList<Snake> terarium = new ArrayList<>();
        ArrayList<Elephant> enclosure = new ArrayList<>();

        snake = new Snake();
        snake.setName("Czarli");
        terarium.add(snake);

        snake = new Snake();
        snake.setName("Benek");
        terarium.add(snake);

        elephant = new Elephant();
        elephant.setName("Teodor");
        enclosure.add(elephant);

        elephant = new Elephant();
        elephant.setName("Bambo");
        enclosure.add(elephant);

        for (Snake s : terarium) {
            System.out.println(s.getName());
        }

        for (Elephant e : enclosure) {
            System.out.println(e.getName());
        }
    }
}
