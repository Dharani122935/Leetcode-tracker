// Last updated: 02/09/2026, 09:55:04
class Solution {
    void solve(int[] nums, int start, int end, int n, int[] dp) {
        for (int i = end; i >= start; i--) {
            if (i == n - 1)
                dp[i] = nums[i]; 
            else if (i == n - 2)
                dp[i] = Math.max(dp[i + 1], nums[i]);
            else
                dp[i] = Math.max(dp[i + 1], nums[i] + dp[i + 2]);
        }
    }
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1)
            return nums[0];
        if (n == 2)
            return Math.max(nums[0], nums[1]);
        int[] dp1 = new int[n];
        int[] dp2 = new int[n];
        solve(nums, 2, n - 2, n, dp1);
        solve(nums, 1, n - 1, n, dp2);
        return Math.max(nums[0] + dp1[2], dp2[1]);
    }
}