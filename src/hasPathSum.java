public class hasPathSum {
    public boolean soluation (TreeNode root,int target){
        if (root==null) return false ;
        if(root.left==null&&root.right==null) return root.val == target;
        return (soluation(root.left,target-root.val)||soluation(root.right,target-root.val));
    }
}
