// Last updated: 09/07/2026, 18:28:43
1class Solution {
2    public int tribonacci(int n) {
3        int [] A = new int[n+1];
4        if(n == 0 || n ==1) return n;
5        if(n==2) return 1;
6        A[0] = 0;
7        A[1] = 1;
8        A[2] = 1;
9        for(int i = 3;i<=n;i++){
10            A[i] = A[i-1]+A[i-2]+A[i-3];
11        }
12        return A[n];
13    }
14}