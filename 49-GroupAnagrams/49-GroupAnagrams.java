// Last updated: 13/07/2026, 11:08:56
1import java.util.*;
2class Solution{
3    public List<List<String>> groupAnagrams(String[] strs){
4        HashMap<String,List<String>> map=new HashMap<>();
5        for(String s:strs){
6            char[] ch=s.toCharArray();
7            Arrays.sort(ch);
8            String key=new String(ch);
9            if(!map.containsKey(key))
10                map.put(key,new ArrayList<>());
11            map.get(key).add(s);
12        }
13        return new ArrayList<>(map.values());
14    }
15}