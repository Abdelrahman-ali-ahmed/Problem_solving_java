public class ListNode {
    int val;          // The value stored in this node
    ListNode next;    // Reference to the next node in the list

    // Constructor to create a node with a value
    public ListNode(int val) {
        this.val = val;
        this.next = null; // By default, next is null
    }
    public ListNode() {}
    // Constructor to create a node with a value and a next node
    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
