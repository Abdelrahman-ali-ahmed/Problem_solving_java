//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        TreeNode root = new TreeNode(3);
//        root.left = new TreeNode(9);
//        root.right = new TreeNode(20);
//        root.right.left = new TreeNode(15);
//        root.right.right = new TreeNode(7);
//
//        minDepth s = new minDepth();

        findFinalValue v=new findFinalValue();
        int[] nums = {5,3,6,1,12};
        int original= 3;
        System.out.println(v.soluation(nums,original));
    }
}