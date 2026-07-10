// Last updated: 10/07/2026, 16:25:22
1class Solution{
2    public String longestPalindrome(String s){
3        String ans="";
4        for(int i=0;i<s.length();i++){
5            String a=expand(s,i,i);
6            String b=expand(s,i,i+1);
7            if(a.length()>ans.length()) ans=a;
8            if(b.length()>ans.length()) ans=b;
9        }
10        return ans;
11    }
12    public String expand(String s,int l,int r){
13        while(l>=0&&r<s.length()&&s.charAt(l)==s.charAt(r)){
14            l--;
15            r++;
16        }
17        return s.substring(l+1,r);
18    }
19}