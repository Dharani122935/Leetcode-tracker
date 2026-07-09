// Last updated: 09/07/2026, 22:17:47
1
2class Solution {
3    public ListNode removeElements(ListNode head, int val) {
4        ListNode ret=new ListNode(0,head);
5        ListNode current=ret;
6        while(current!=null){
7            while(current.next!=null&&current.next.val==val){
8                current.next=current.next.next;
9            }
10            current=current.next;
11        }
12        return ret.next;
13    }
14}