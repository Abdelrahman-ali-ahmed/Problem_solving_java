public class isSameTree {
    public boolean soluation(TreeNode p,TreeNode q){
        if (p == null && q== null ) return true;
        if (p==null || q==null) return false;
        if (p.val !=q.val) return false;
        return soluation(p.right,q.right) && soluation(p.left,q.left);

    }
}
