// Last updated: 09/07/2026, 09:18:10
class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0,left=0,right=0;
        for(int i:nums){
            sum+=i;
        }
        for(int i=0;i<nums.length;i++){
            right=sum-left-nums[i];
            if(left==right){
                return i;
            }
            left=left+nums[i];
        }
        return-1;
    }
}
