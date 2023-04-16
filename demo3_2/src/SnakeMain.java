import net.roszczyk.java.Snake;

public class SnakeMain {
    public static void main(String[] args)
    {
        Snake snake = new Snake("Tosia");

        System.out.println(snake.GetName());

        snake.SetName("Kasia");

        System.out.println(snake.GetName());

        snake.SetName("Ala Ma Kota a Basia Psa");

        System.out.println(snake.GetName());
    }
}
