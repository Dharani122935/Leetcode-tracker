// Last updated: 02/09/2026, 09:50:59
class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length()!=goal.length()){
            return false;
        }
        return (s+s).contains(goal);
    }
}