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

       ListNode n1=new ListNode(3);
        ListNode n2=new ListNode(2);
        ListNode n3=new ListNode(0);
        ListNode n4=new ListNode(4);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n2;
        hasCycle v=new hasCycle();
        System.out.println(v.soluation(n1));
    }
}