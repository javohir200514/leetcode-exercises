package easy.math.oddevenlinkedlist_100;

public class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head==null||head.next==null) return head;
        ListNode odd=head;
        ListNode even=head.next;
        ListNode start=even;
        while (even != null &&even.next!=null){
            odd.next=even.next;
            odd = odd.next;
            even.next=odd.next;
            even = even.next;
        }
        odd.next=start;
        return head;
    }
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
