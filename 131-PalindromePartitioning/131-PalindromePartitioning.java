// Last updated: 09/07/2026, 17:56:04
1import java.util.*;
2
3class Solution {
4    public List<List<String>> partition(String s) {
5        List<List<String>> list = new ArrayList<>();
6        List<String> path = new ArrayList<>();
7        fxn(0, s, path, list);
8        return list;
9    }
10
11    public void fxn(int index, String s, List<String> path, List<List<String>> list) {
12        if (index == s.length()) {
13            list.add(new ArrayList<>(path));
14            return;
15        }
16        for (int i = index; i < s.length(); i++) {
17            if (isPalindrome(s, index, i)) {
18                path.add(s.substring(index, i + 1));
19                fxn(i + 1, s, path, list);
20                path.remove(path.size() - 1); // backtrack
21            }
22        }
23    }
24
25    boolean isPalindrome(String s, int st, int end) {
26        while (st < end) {
27            if (s.charAt(st++) != s.charAt(end--)) return false;
28        }
29        return true;
30    }
31}