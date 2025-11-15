//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TreeNode s1 = new TreeNode(1);
        TreeNode s2 = new TreeNode(2);
        TreeNode s3 = new TreeNode(3);
        TreeNode s4 = new TreeNode(4);
        TreeNode s5 = new TreeNode(5);
        TreeNode s6 = new TreeNode(6);
        TreeNode s7 = new TreeNode(7);
        TreeNode s8 = new TreeNode(8);
        TreeNode s9 = new TreeNode(9);
        inorderTraversal i=new inorderTraversal();

        // Build the tree
        s1.left = s2;
        s1.right = s3;

        s2.left = s4;
        s2.right = s5;

        s5.left = s6;
        s5.right = s7;

        s3.right = s8;
        s8.left = s9;
        System.out.println(i.soluation(s1));
    }
}