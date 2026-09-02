// Last updated: 02/09/2026, 09:53:33
class Solution {
    public boolean isPerfectSquare(int num) {
     int i = 1;
     while (num > 0) {
         num -= i;
         i += 2;
     }
     return num == 0;
 }
}