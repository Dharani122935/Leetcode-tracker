// Last updated: 09/07/2026, 18:08:01
1class Solution {
2    public int search(int[] nums, int target) {
3       int n = nums.length;
4       int low = 0;
5       int high = n - 1;
6       
7       while (low <= high) {
8            int mid = (low + high) / 2;
9            if (nums[mid] == target) {
10                return mid;
11            } else if (target < nums[mid]) {
12                high = mid - 1;
13            } else {
14                low = mid + 1;
15            }
16       }
17       return -1; 
18    }
19}