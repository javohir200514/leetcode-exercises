package easy.math.removeduplicatesfromsortedlist_100;

public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode ans=new ListNode(0,head);
        ListNode temp=ans;
        while (temp.next!=null){
            if(temp.next.next!=null&&temp.next.val==temp.next.next.val){
                temp.next=temp.next.next;
            }else{
                temp=temp.next;
            }

        }
        return ans.next;
    }
    public class ListNode {
      int val;
      ListNode next;
       ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
