// Last updated: 09/07/2026, 18:29:36
1class Solution {
2    public boolean isUgly(int n) {
3        if(n <= 0) return false;
4
5        n = uglyChecker(n, 2);
6        n = uglyChecker(n, 3);
7        n = uglyChecker(n, 5);
8
9        return n == 1;
10    }
11
12    public int uglyChecker(int num, int factor){
13        while(num % factor == 0){
14            num /= factor;
15        }
16
17        return num;
18    }
19}