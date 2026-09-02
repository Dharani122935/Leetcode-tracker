// Last updated: 02/09/2026, 09:49:09
class Solution {
    public String addSpaces(String s, int[] spaces) {
        int n = s.length();
        int m = spaces.length;
        int idx = 0;
        StringBuilder str = new StringBuilder();
        for(int i=0;i<n;i++)
        {
            char ch = s.charAt(i);
            if(idx<m && i==spaces[idx])
            {
                idx++;
                str.append(" ");
            }
            str.append(ch);
        }
        return str.toString();
    }
}