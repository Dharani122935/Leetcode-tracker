// Last updated: 13/07/2026, 10:12:02

class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode ret=new ListNode(0,head);
        ListNode current=ret;
        while(current!=null){
            while(current.next!=null&&current.next.val==val){
                current.next=current.next.next;
            }
            current=current.next;
        }
        return ret.next;
    }
}