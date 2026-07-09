// Last updated: 09/07/2026, 22:07:41
1class Solution {
2    public int climbStairs(int n) {
3        if (n == 1) return 1;
4        if (n == 2) return 2;
5
6        int first = 1; 
7        int second = 2;
8        int result = 0;
9
10        for (int i = 3; i <= n; i++) {
11            result = first + second;
12            first = second;
13            second = result;
14        }
15
16        return result;
17    }
18}
19