import net.roszczyk.animal.*;

public class SnakeMain
{
    public static void main(String[] args)
    {
        Elephant elephant = new Elephant();
        elephant.setName("Bolek");

        Snake snake = new Snake();
        snake.setName("Tosia");

        System.out.println(elephant.getName());
        System.out.println(snake.getName());
    }
}
