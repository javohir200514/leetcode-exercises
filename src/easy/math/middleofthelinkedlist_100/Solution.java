package easy.math.middleofthelinkedlist_100;

public class Solution {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static ListNode middleNode(ListNode head) {
            ListNode first=new ListNode(0,head);
            ListNode temp=first;
            int count=0;
            while (temp.next!=null){
                count++;
                temp=temp.next;
            }
            int i=0;
            while (i<count/2){
                first.next=first.next.next;
                i++;
            }
            return first;
    }
}
