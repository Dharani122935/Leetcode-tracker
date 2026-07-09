// Last updated: 09/07/2026, 18:12:24
1class Solution {
2    public int thirdMax(int[] nums) {
3        long first = Long.MIN_VALUE;
4        long second = Long.MIN_VALUE;
5        long third = Long.MIN_VALUE;
6
7        for (int i = 0; i < nums.length; i++) {
8            if (nums[i] > first) {
9                third = second;
10                second = first;
11                first = nums[i];
12            } else if (nums[i] > second && nums[i] != first) {
13                third = second;
14                second = nums[i];
15            } else if (nums[i] > third && nums[i] != first && nums[i] != second) {
16                third = nums[i];
17            }
18        }
19        if (third == Long.MIN_VALUE) {
20            return (int)first;
21        }
22        return (int)third;
23    }
24}