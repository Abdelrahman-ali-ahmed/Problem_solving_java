//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TreeNode s1 = new TreeNode(3);
        TreeNode s2 = new TreeNode(9);
        TreeNode s3 = new TreeNode(20);
        TreeNode s4 = new TreeNode(15);
        TreeNode s5 = new TreeNode(7);
        TreeNode s6 = new TreeNode(4);
        TreeNode s7= new TreeNode(4);

        maxDepth i=new maxDepth();

        // Build the tree
        s1.left = s2;
        s1.right = s3;

        s3.left = s4;
        s3.right = s6;
     sortedArrayToBST s = new sortedArrayToBST();
        int[] arr = new int[]{3, 5, 8};
        TreeNode root = s.soluation(arr);

        s.printInOrder(root);
    }
}