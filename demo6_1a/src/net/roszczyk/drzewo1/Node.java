package net.roszczyk.drzewo1;
public class Node {
    public Integer data;
    public Node left;
    public Node right;

    public Node(int value) {
        this.data = value;
        this.left = null;
        this.right = null;
    }

    @Override
    public String toString() {
        return "(" + data.toString() + ")";
    }
}
