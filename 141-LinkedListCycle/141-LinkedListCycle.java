// Last updated: 09/07/2026, 09:18:24
public class Solution {
    public boolean hasCycle(ListNode head) {
          ListNode fast = head;
        ListNode slow = head;
        while(fast!=null&&fast.next!=null){
            fast = fast.next.next;  // Move fast two steps
            slow = slow.next;       // Move slow one step
            if(fast==slow){        // Cycle detected
                return true;
            }
        }
      return false;
        
    }
}