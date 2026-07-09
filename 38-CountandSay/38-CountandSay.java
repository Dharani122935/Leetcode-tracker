// Last updated: 09/07/2026, 18:11:00
1class Solution {
2    public int findContentChildren(int[] g, int[] s) {
3        Arrays.sort(g);
4        Arrays.sort(s);
5        int n = g.length, m = s.length, i = 0, j = 0;
6
7        while (i < m && j < n) {
8            if (g[j] <= s[i]) j++;  
9            i++;  
10        }
11
12        return j;
13    }
14}