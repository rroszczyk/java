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

        tree.displayAsc();
    }
}