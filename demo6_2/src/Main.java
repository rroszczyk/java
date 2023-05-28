import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();

        tree.insertR(100);
        tree.insertR(43);
        tree.insertR(53);
        tree.insertR(134);
        tree.insertR(93);
        tree.insertR(2);
        tree.insertR(112);
        tree.insertR(45);

        tree.display();
        tree.displayAsc();
        tree.displayDsc();

        System.out.println("Minimalna wartość: " + tree.getMin().toString());
        System.out.println("Maksymalna wartość: " + tree.getMax().toString());

        System.out.println((tree.contains(132) != null)?"ok":"brak");
        System.out.println((tree.contains(2) != null)?"ok":"brak");
    }
}