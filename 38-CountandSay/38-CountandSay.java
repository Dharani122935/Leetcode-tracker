// Last updated: 09/07/2026, 18:02:43
1class Solution {
2    public int[] sortArrayByParityII(int[] nums) {
3        int even = 0, odd = 1;
4        int n = nums.length;
5
6        while (even < n && odd < n) {
7            if (nums[even] % 2 == 1) {
8                int temp = nums[even];
9                nums[even] = nums[odd];
10                nums[odd] = temp;
11                odd += 2;
12            } else {
13                even += 2;
14            }
15
16        }
17            return nums;
18    }
19}