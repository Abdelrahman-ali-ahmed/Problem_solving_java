public class minDepth {
    public int soluation (TreeNode root){
  return minDep(root);
    }
    private int minDep(TreeNode root) {
        if (root==null) return 0;
        if(root.left==null&&root.right==null) return 1;
        int left=root.left!=null?minDep(root.left):0;
        int right=root.right!=null?minDep(root.right):0;
        return left!=0&&right!=0?Math.min(left,right)+1:Math.max(left,right)+1;
    }
}
