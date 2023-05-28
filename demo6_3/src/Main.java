public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();

        tree.add(100);
        tree.add(325);
        tree.add(385);
        tree.add(777);
        tree.add(853);
        tree.add(225);
        tree.add(1);
        tree.add(14);
        tree.add(999);
        tree.add(1414);
        tree.add(25);
        tree.add(21);
        tree.add(5);
        tree.add(77);
        tree.add(423);

        tree.display();
        tree.displayAsc();
        tree.displayDsc();

        System.out.println("Minimalna wartość: " + tree.getMin().toString());
        System.out.println("Maksymalna wartość: " + tree.getMax().toString());
        System.out.println("Liczba elementów w drzewie: " + tree.getNodesCount().toString());
    }
}