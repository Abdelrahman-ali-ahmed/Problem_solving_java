//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TreeNode s1 = new TreeNode(1);
        TreeNode s2 = new TreeNode(2);
        TreeNode s3 = new TreeNode(2);
        TreeNode s4 = new TreeNode(3);
        TreeNode s5 = new TreeNode(3);
        TreeNode s6 = new TreeNode(4);
        TreeNode s7= new TreeNode(4);

        isSymmetric i=new isSymmetric();

        // Build the tree
        s1.left = s2;
        s1.right = s3;

        s2.left = s4;
        s2.right = s6;
        s3.left = s7;
        s3.right = s5;


        System.out.println(i.soluation(s1));
    }
}