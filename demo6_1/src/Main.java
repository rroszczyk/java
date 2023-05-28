import net.roszczyk.drzewo1.Tree;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();

        tree.insert(488);
        tree.insert(240);
        tree.insert(189);
        tree.insert(54);
        tree.insert(212);
        tree.insert(280);
        tree.insert(301);
        tree.insert(874);
        tree.insert(535);
        tree.insert(500);

        System.out.println("(" + tree.getElements() + ")");
        System.out.println("(" + tree.getElementsAsc() + ")");
        System.out.println("(" + tree.getElementsDsc() + ")");

        if (tree.search(54) != null)
        {
            System.out.println("Ok");
        }

        System.out.println(tree.getSize());  // 10
        System.out.println(tree.getMin());   // 54
        System.out.println(tree.getMax());   // 874

        tree.insert(100);
        System.out.println(tree.getSize());  // 11
    }
}