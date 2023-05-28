public class Tree {
    Node root;

    public Tree() {
        root = null;
    }

    public Node insert(Integer value)
    {
        Node node = new Node(value);

        if (root == null) {
            root = node;
            return node;
        }
        Node current = root;
        Node parent = null;
        while (true) {
            parent = current;
            if (node.value < current.value) {
                current = current.left;
                if (current == null) {
                    parent.left = node;
                    return node;
                }
            } else {
                current = current.right;
                if (current == null) {
                    parent.right = node;
                    return node;
                }
            }
        }
    }
    public void display() {
        display(this.root);
        System.out.println();
    }
    private void display(Node root) {
        if (root != null) {
            System.out.print(root.value + " ");
            display(root.left);
            display(root.right);
        }
    }
    public void displayAsc() {
        displayAsc(this.root);
        System.out.println();
    }
    private void displayAsc(Node root) {
        if (root != null) {
            displayAsc(root.left);
            System.out.print(root.value + " ");
            displayAsc(root.right);
        }
    }
    public void displayDsc() {
        displayDsc(this.root);
        System.out.println();
    }
    private void displayDsc(Node root) {
        if (root != null) {
            displayDsc(root.right);
            System.out.print(root.value + " ");
            displayDsc(root.left);
        }
    }
    public Integer getMin() {
        return getMin(this.root);
    }
    public Integer getMin(Node root) {
        if (root != null) {
            if (root.left != null) {
                return getMin(root.left);
            }
            return root.value;
        }
        return 0;
    }
    public Integer getMax() {
        return getMax(this.root);
    }
    public Integer getMax(Node root) {
        if (root != null) {
            if (root.right != null) {
                return getMax(root.right);
            }
            return root.value;
        }
        return 0;
    }
    public Node contains(Integer value) {
        return contains(this.root, value);
    }
    private Node contains(Node root, Integer value) {
        if (root != null) {
            if (root.value == value) {
                return root;
            }
            if (root.value < value) {
                return contains(root.right, value);
            } else {
                return contains(root.left, value);
            }
        }
        return null;
    }
}
