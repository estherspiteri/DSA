public class TreeImplementation {
    private TreeNode root;
    private boolean start = true;

    private TreeNode addRecursive(TreeNode current, int value) {

        //when the current node is null --> leaf node reached
        //therefore insert new node in that position
        if (current == null) {
            return new TreeNode(value);
        }

        //if inputted value is lower than the current node’s, access left child
        if (value < current.getValue()) {
            current.setLeft(addRecursive(current.getLeft(), value));
        }
        //if inputted value is greater than the current node’s, access right child
        else if (value > current.getValue()) {
            current.setRight(addRecursive(current.getRight(), value));
        }
        else {
            // value already exists therefore ignore
            return current;
        }
        return current;
    }

    //to display tree via pre-order traversal --> root node, left subtree, right subtree
    private void treeDisplay(TreeNode current) {
        if (start) {
            System.out.format("%s%15s%15s", "Node", "Left Child", "Right Child");
            System.out.println();
            start = false;
        }
        if (current != null){

            //outputting values of current node
            System.out.format("%s%15s%15s", current.getValue(),
                    //if not null output the value else output null
                    current.getLeft() != null ? current.getLeft().getValue() : "null",
                    current.getRight() != null ? current.getRight().getValue() : "null");
            System.out.println();

            //display left-subtree
            treeDisplay(current.getLeft());

            //display right-subtree
            treeDisplay(current.getRight());
        }
    }

public void add(int value) {
    root = addRecursive(root, value);
    treeDisplay(root);
    System.out.println();
    start = true;
}
}
