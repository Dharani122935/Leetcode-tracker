// Last updated: 07/09/2026, 14:10:52
1class Solution {
2    public boolean isTrionic(int[] nums) {
3        int n = nums.length;
4        if (n < 4) return false;
5        int i = 0;
6        while (i + 1 < n && nums[i] < nums[i+1]) {
7            i++;
8        }
9        if (i == 0 || i == n - 1) return false;
10        int p = i;
11        while (i + 1 < n && nums[i] > nums[i+1]) {
12            i++;
13        }
14        if (i == p || i == n - 1) return false;
15        while (i + 1 < n && nums[i] < nums[i+1]) {
16            i++;
17        }
18        return i == n - 1;
19    }
20}