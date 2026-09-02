// Last updated: 02/09/2026, 09:49:13
class Solution {
    public int[] getConcatenation(int[] nums){
        int n=nums.length;
        int[] ans=new int[2*n];
        for(int i=0;i<n;i++){
            ans[i]=nums[i];
            ans[i+n]=nums[i];
        }
        return ans;
    }
}