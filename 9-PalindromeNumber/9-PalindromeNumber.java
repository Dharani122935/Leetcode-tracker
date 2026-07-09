// Last updated: 09/07/2026, 09:19:04
class Solution {
    public boolean isPalindrome(int x) {
        int t=x;
        int rev=0;
        while(x>0){
            int dig=x%10;
            rev=rev*10+dig;
             x/=10;
        }
        if(rev==t){
            return true;
        }else{
            return false;
        }
    }
}