// Last updated: 07/09/2026, 14:23:04
1class Solution {
2    public int[] transformArray(int[] nums) {
3        for(int i=0;i<nums.length;i++){
4            if(nums[i]%2==0){
5                nums[i]=0;         
6            }
7                else{
8                    nums[i]=1;
9                }
10        }
11        Arrays.sort(nums);
12        return nums;
13    }
14}