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
    public String getElements() {
        return getElements(root);
    }
    private String getElements(Node current) {
        String elements = "";
        if (current != null) {
            elements += current.data.toString();
            if (current.left != null)
                elements += " " + getElements(current.left);
            if (current.right != null)
            elements += " " + getElements(current.right);
        }
        return elements;
    }
    public String getElementsAsc() {
        return getElementsAsc(root);
    }
    private String getElementsAsc(Node current) {
        String elements = "";
        if (current != null) {
            if (current.left != null)
                elements += getElementsAsc(current.left);
            if (elements.length() > 0) elements += " ";
            elements += current.data.toString();
            if (current.right != null)
                elements += " " + getElementsAsc(current.right);
        }
        return elements;
    }
    public String getElementsDsc() {
        return getElementsDsc(root);
    }
    private String getElementsDsc(Node current) {
        String elements = "";
        if (current != null) {
            if (current.right != null)
                elements += getElementsDsc(current.right);
            if (elements.length() > 0) elements += " ";
            elements += current.data.toString();
            if (current.left != null)
                elements += " " + getElementsDsc(current.left);
        }
        return elements;
    }
    public Node search(Integer value) {
        return search(root, value);
    }
    private Node search(Node current, Integer value) {
        Node tmp = null;
        if (current != null) {
            tmp = search(current.left, value);
            if (tmp != null) {
                return tmp;
            }
            if (current.data == value) {
                return current;
            }
            tmp = search(current.right, value);
            if (tmp != null) {
                return tmp;
            }
        }
        return null;
    }
    public Integer getSize() {
        return getSize(root);
    }
    private Integer getSize(Node current) {
        if (current == null) {
            return 0;
        }
        return getSize(current.right) + 1 + getSize(current.left);
    }
    public Integer getMin() {
        return getMin(root);
    }
    private Integer getMin(Node current) {
        if (current != null) {
            if (current.left == null) {
                return current.data;
            } else {
                return getMin(current.left);
            }
        } return 0;
    }
    public Integer getMax() {
        return getMax(root);
    }
    private Integer getMax(Node current) {
        if (current != null) {
            if (current.right == null) {
                return current.data;
            } else {
                return getMax(current.right);
            }
        } return 0;
    }
}









