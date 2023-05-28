import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();

        tree.insert(100);
        tree.insert(43);
        tree.insert(53);
        tree.insert(134);
        tree.insert(93);
        tree.insert(2);
        tree.insert(112);
        tree.insert(45);

        tree.display();
        tree.displayAsc();
        tree.displayDsc();

        System.out.println("Minimalna wartość: " + tree.getMin().toString());
        System.out.println("Maksymalna wartość: " + tree.getMax().toString());

        System.out.println((tree.contains(132) != null)?"ok":"brak");
        System.out.println((tree.contains(2) != null)?"ok":"brak");
    }
}