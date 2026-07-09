// Last updated: 09/07/2026, 18:14:04
1class Solution {
2    public int missingInteger(int[] nums) {
3       int sum = nums[0];
4        for (int i = 1; i < nums.length; i++) 
5        {
6            if (nums[i] == nums[i - 1] + 1) 
7            {
8                sum =sum+ nums[i];
9            } else 
10            {
11                break; 
12            }
13        }
14
15        for (int i = 0; i < nums.length; i++) {
16            if (nums[i] == sum) {
17                sum++;  
18                i = -1; 
19            }
20        }
21
22        return sum;
23    }
24}