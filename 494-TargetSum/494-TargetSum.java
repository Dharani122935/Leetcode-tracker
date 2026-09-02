// Last updated: 02/09/2026, 09:52:02
class Solution {
    public int answer(int[] nums,int target,int start,int sum){
        if (start==nums.length){
            return sum==target?1:0;
        }
        int add=answer(nums,target,start+1,sum+nums[start]);
        int sub=answer(nums,target,start+1,sum-nums[start]);
        return add+sub;
    }
    public int findTargetSumWays(int[] nums,int target) {
        return answer(nums,target,0,0);
    }
}