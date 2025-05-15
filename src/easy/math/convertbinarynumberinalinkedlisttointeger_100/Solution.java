package easy.math.convertbinarynumberinalinkedlisttointeger_100;


public class Solution {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public int getDecimalValue(ListNode head) {
        ListNode temp=head;
        int size=0;
        while (temp!=null){
            temp=temp.next;
            size++;
        }
        ListNode result=head;
        int value=0;
        while (result!=null){
            value+= (int) (result.val*Math.pow(2,size-1));
            size--;
            result=result.next;
        }
        return value;
    }
}
