// Last updated: 09/07/2026, 18:03:29
1class Solution {
2    public int[] sortArrayByParity(int[] nums) {
3        int j=0;
4       for(int i =0;i<nums.length;i++){
5            if(nums[i]%2==0){
6                int temp =nums[i];
7                nums[i]=nums[j];
8                nums[j]=temp;
9                j++;
10            }
11        }
12    return nums;}
13}