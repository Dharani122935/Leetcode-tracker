// Last updated: 09/07/2026, 09:18:31
class Solution {
    //readysync
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left=0,right=s.length()-1;
        while(left<right) {
            if (s.charAt(left)!=s.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }
}