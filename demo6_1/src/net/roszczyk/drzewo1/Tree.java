package net.roszczyk.drzewo1;

public class Tree {
    private Node root;

    public Tree() {
        root = null;
    }

    public Node insert(Integer value) {
        Node tmp = new Node(value);

        if (root == null) {
            root = tmp;
            return tmp;
        } else {
            Node current = root;
            Node parent = null;

            while (true) {
                parent = current;
                if (tmp.data < parent.data) {
                    current = current.left;
                    if (current == null) {
                        parent.left = tmp;
                        return tmp;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = tmp;
                        return tmp;
                    }
                }
            }
        }
    }

    private void display(Node current) {
        if (current != null) {
            System.out.print(current.data + " ");
            display(current.left);
            display(current.right);
        }
    }

    private void displayAsc(Node current) {
        if (current != null) {
            displayAsc(current.left);
            System.out.print(current.data + " ");
            displayAsc(current.right);
        }
    }

    public void display() {
        display(root);
    }

    public void displayAsc() {
        displayAsc(root);
    }
}









