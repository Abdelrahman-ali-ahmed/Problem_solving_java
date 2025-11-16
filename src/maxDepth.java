public class maxDepth {
    public int soluation(TreeNode root ){
        if (root == null) return 0;
        if(root.left==null&& root.right==null) return 1;
        int  left= soluation(root.left);
        int  right= soluation(root.right);
      return 1+Math.max(left,right);
    }
}
