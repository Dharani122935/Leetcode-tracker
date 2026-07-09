// Last updated: 09/07/2026, 09:18:53
class Solution {
    //readysync
    public int removeDuplicates(int[] nums) {
        int i=0;
        for(int j=i+1;j<nums.length;j++){
            if(nums[i]!=nums[j]){
            i++;
            nums[i]=nums[j];
            }
        }
        return i+1;
    }
}