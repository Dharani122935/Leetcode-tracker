// Last updated: 09/07/2026, 22:19:09
1
2class Solution {
3    public ListNode reverseList(ListNode head) {
4        ListNode prev=null;
5        ListNode current=head;
6        while(current!=null){
7            ListNode next=current.next;
8            current.next=prev;
9            prev=current;
10            current=next;
11        }
12        return prev;
13
14
15    }
16}