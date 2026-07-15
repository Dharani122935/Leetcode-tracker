// Last updated: 15/07/2026, 10:20:36
1import java.util.*;
2class Solution {
3    public boolean isIsomorphic(String s, String t) {
4        HashMap<Character,Character> map1=new HashMap<>();
5        HashMap<Character,Character> map2=new HashMap<>();
6        for(int i=0;i<s.length();i++){
7            char c1=s.charAt(i),c2=t.charAt(i);
8            if(map1.containsKey(c1)){
9                if(map1.get(c1)!=c2) return false;
10            }else{
11                map1.put(c1,c2);
12            }
13            if(map2.containsKey(c2)){
14                if(map2.get(c2)!=c1) return false;
15            }else{
16                map2.put(c2,c1);
17            }
18        }
19        return true;
20    }
21}