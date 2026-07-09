// Last updated: 09/07/2026, 22:21:49
1
2class Solution {
3    public void deleteNode(ListNode node) {
4        node.val=node.next.val;
5        node.next=node.next.next;
6    }
7}