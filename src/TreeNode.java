public class TreeNode {
    private int value;
    private TreeNode left;
    private TreeNode right;

    //TreeNode constructor
    TreeNode(int input){
        this.value = input;
        this.left = null;
        this.right = null;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    public int getValue() {
        return value;
    }

    public TreeNode getLeft() {
        return left;
    }

    public TreeNode getRight() {
        return right;
    }
}
