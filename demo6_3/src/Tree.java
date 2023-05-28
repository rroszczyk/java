public class Tree {
    private Node root;
    public Tree() {
        this.root = null;
    }
    public void add(Integer value)
    {
        Node node = new Node(value);
        if (root == null) {
            root = node;
            return;
        } else {
            Node current = root;
            Node parent = null;
            while (true) {
                parent = current;
                if (node.value < parent.value) {
                    current = parent.left;
                    if (current == null) {
                        parent.left = node;
                        return;
                    }
                } else {
                    current = parent.right;
                    if (current == null) {
                        parent.right = node;
                        return;
                    }
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
    private Integer getMin(Node root) {
        if (root != null) {
            if (root.left != null) return getMin(root.left);
            return root.value;
        }
        return 0;
    }
    public Integer getMax() {
        return getMax(this.root);
    }
    private Integer getMax(Node root) {
        if (root != null) {
            if (root.right != null) return getMax(root.right);
            return root.value;
        }
        return 0;
    }
    public Integer getNodesCount() {
        return getNodesCount(this.root);
    }
    private Integer getNodesCount(Node root) {
        if (root != null) {
            return getNodesCount(root.left) + 1 + getNodesCount(root.right);
        } else return 0;
    }
}
