// Last updated: 02/09/2026, 09:51:24
class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int result=0;
        for(int i=0;i<nums.length;i+=2){
            result+=nums[i];
        }
        return result;
    }
}