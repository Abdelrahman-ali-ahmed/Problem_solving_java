import java.util.ArrayList;
import java.util.List;

public class inorderTraversal {
    public List<Integer> soluation (TreeNode root) {
        List<Integer> arr=new ArrayList<>();
        if(root==null) return arr;
        if(root.left==null){
            arr.add(root.val);
        }else{
            arr.addAll(soluation(root.left));
            arr.add(root.val);
        }
        if (root.right!=null){
            arr.addAll(soluation(root.right));
        }
        return arr;
    }
}
