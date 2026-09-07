// Last updated: 07/09/2026, 13:57:55
1class Solution {
2    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
3        boolean[] ans = new boolean[queries.length];
4        int[] ps = new int[nums.length];
5        for(int i=1;i<nums.length;i++){
6            ps[i] = ps[i-1];
7            if(nums[i-1]%2 == nums[i]%2){
8                ps[i]++;
9            }
10        }
11        for(int i=0;i<queries.length;i++){
12            int from = queries[i][0],to = queries[i][1];
13            int cnt = ps[to] - ps[from];
14            ans[i] = cnt>0 ? false : true;
15        }
16        return ans;
17    }
18}