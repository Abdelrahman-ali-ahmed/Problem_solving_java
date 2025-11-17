public class sortedArrayToBST {
    public TreeNode soluation(int[] nums) {

        return Sbuild (  nums,0,nums.length-1);
    }
   private TreeNode Sbuild(int[] nums,int left, int right){
        if (left>right) return null;
        int mid=(int)Math.floor((left+right)/2);
        TreeNode node= new TreeNode(nums[mid]);
        node.left=Sbuild(nums,left,mid-1);
        node.right=Sbuild(nums,mid+1,right);
        return node ;
    }
    public void printInOrder(TreeNode root) {
        if (root == null) return;
        printInOrder(root.left);
        System.out.print(root.val + " ");
        printInOrder(root.right);
    }
}
