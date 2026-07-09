// Last updated: 09/07/2026, 22:22:51
1
2class Solution {
3    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
4
5        if(list1!=null && list2!=null){
6        if(list1.val<list2.val){
7            list1.next=mergeTwoLists(list1.next,list2);
8            return list1;
9            }
10            else{
11                list2.next=mergeTwoLists(list1,list2.next);
12                return list2;
13        }
14        }
15        if(list1==null)
16            return list2;
17        return list1;
18    }
19}