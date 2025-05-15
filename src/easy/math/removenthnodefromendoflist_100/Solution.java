package easy.math.removenthnodefromendoflist_100;

public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null) return head.next;
        ListNode result=new ListNode(0,head);
        ListNode temp=result;
        int count=0;
        while (temp.next!=null){
            temp=temp.next;
            count++;
        }
        int i=0;
        ListNode temp2=result;
        while (i<count-n){
            temp2=temp2.next;
            i++;
        }
        temp2.next=temp2.next.next;
        return  result.next;
    }
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val,ListNode next) { this.val = val; this.next = next; }
    }
}
