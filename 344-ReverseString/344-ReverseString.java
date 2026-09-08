// Last updated: 08/09/2026, 14:01:12
1class Solution {
2    public void reverseString(char[] s) {
3        int start = 0;
4        int end = s.length - 1;
5        while(start <= end){
6            char temp = s[start];
7            s[start] = s[end];
8            s[end] = temp;
9            start++;
10            end--;
11        }
12    }
13}