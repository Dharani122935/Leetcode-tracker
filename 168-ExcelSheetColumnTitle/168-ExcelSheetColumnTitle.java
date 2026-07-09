// Last updated: 09/07/2026, 22:03:27
1class Solution {
2    public boolean isPowerOfThree(int n) {
3        if (n == 1) return true;
4        if (n <= 0 || n % 3 != 0) return false;
5        return isPowerOfThree(n / 3);
6    }
7}