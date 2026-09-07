// Last updated: 07/09/2026, 14:34:02
1class Solution {
2    public List<String> stringMatching(String[] words) {
3        List<String> result = new ArrayList<>();
4        int n = words.length;
5        for(int i = 0; i < n; i++) {
6            for(int j = 0; j < n; j++) {
7                if(i != j && words[j].contains(words[i])) {
8                    result.add(words[i]);
9                    break;
10                }
11            }
12        }
13        return result;
14    }
15}