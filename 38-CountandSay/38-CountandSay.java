// Last updated: 09/07/2026, 18:10:15
1class Solution {
2    public int findMaxConsecutiveOnes(int[] nums) {
3        int k=0;
4        int max=0;
5        
6        for (int i=0;i<nums.length;i++){
7            if (nums[i]==1){
8                k++;
9            }
10            else{
11                max = Math.max(max,k);
12                k=0;
13            }
14        }
15        max =Math.max(k,max);
16        return max;
17    }
18}