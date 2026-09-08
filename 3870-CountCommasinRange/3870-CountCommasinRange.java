// Last updated: 08/09/2026, 09:47:30
1class Solution {
2    public int countCommas(int n) {
3        int c=0;
4        for(int i=1;i<=n;i++){
5            if(i>=1000){
6                c++;
7            }
8        }
9        return c;
10    }
11}