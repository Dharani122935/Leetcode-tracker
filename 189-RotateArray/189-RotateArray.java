// Last updated: 09/07/2026, 09:18:17
class Solution {
    //readysync
    public void rotate(int[] nums, int k) {
        int res[]=new int[nums.length];
       for(int i=0;i<nums.length;i++){
        res[(i+k)%nums.length]=nums[i];
       } 
       for(int i=0;i<nums.length;i++){
        nums[i]=res[i];
       }
    }
}