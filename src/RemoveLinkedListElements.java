public class RemoveLinkedListElements {
    public ListNode soluation (ListNode head, int val){
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;
        ListNode current = head;

        while (current != null) {
            if (current.val == val) {
                prev.next = current.next;   // remove current
            } else {
                prev = current;             // move prev only when no deletion
            }
            current = current.next;         // always move current
        }

        return dummy.next;
    }
}
