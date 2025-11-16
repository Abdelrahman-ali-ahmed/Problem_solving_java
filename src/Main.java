//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TreeNode s1 = new TreeNode(1);
        TreeNode s2 = new TreeNode(2);
        TreeNode s3 = new TreeNode(3);
        TreeNode s4 = new TreeNode(1);
        TreeNode s5 = new TreeNode(2);
        TreeNode s6 = new TreeNode(3);

        isSameTree i=new isSameTree();

        // Build the tree
        s1.left = s2;
        s1.right = s3;

        s4.left = s5;
        s4.right = s6;


        System.out.println(i.soluation(s1,s4));
    }
}