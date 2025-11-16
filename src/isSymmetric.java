public class isSymmetric {
    public boolean isSameTree(TreeNode p,TreeNode q){
        if (p == null && q== null ) return true;
        if (p==null || q==null) return false;
        if (p.val !=q.val) return false;
        return isSameTree(p.right,q.left) && isSameTree(p.left,q.right);

    }
    public boolean soluation(TreeNode root ){
        if (root.left == null && root.right==null) return true;
        TreeNode left =new TreeNode();
        TreeNode right =new TreeNode();
        if(root.left !=null && root.right !=null  ) {left=root.left;right=root.right;}
        else return false;
        return  left!= null && right !=null ? isSameTree(left,right):false;

    }
}
