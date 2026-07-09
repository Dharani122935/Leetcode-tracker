// Last updated: 09/07/2026, 18:09:28
1class Solution {
2    public int[] findErrorNums(int[] nums) {
3        int dup = -1, missing = -1;
4        
5        for (int i = 1; i <= nums.length; i++) {
6            int count = 0;
7            for (int j = 0; j < nums.length; j++) {
8                if (nums[j] == i) {
9                    count++;
10                }
11            }
12            if (count == 2) {
13                dup = i;
14            } else if (count == 0) {
15                missing = i;
16            }
17        }
18        
19        return new int[] {dup, missing};
20    }
21}
22