public class hasCycle {
    public boolean soluation(ListNode head){
        ListNode fast=head, slow=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                return true;
            }
        }
        return false ;
    }
}
