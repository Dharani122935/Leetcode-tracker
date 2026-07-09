// Last updated: 09/07/2026, 22:12:25
1class Solution {
2    public String[] findWords(String[] words) {
3        ArrayList<String> result = new ArrayList<>();
4        for (String word : words) {
5            if (keyBoardVerify(word)) {
6                result.add(word);
7            }
8        }
9        return result.toArray(new String[0]);
10    }
11    static boolean keyBoardVerify(String st) {
12        String[] stArr = {
13            "qwertyuiopQWERTYUIOP",
14            "asdfghjklASDFGHJKL",
15            "zxcvbnmZXCVBNM"
16        };
17        char ch = st.charAt(0);
18        int ind = -1;
19        // Find the row of the first letter
20        for (int i = 0; i < stArr.length; i++) {
21            if (stArr[i].indexOf(ch) >= 0) {
22                ind = i;
23                break;
24            }
25        }
26        // Check if all characters are in that row
27        for (int i = 1; i < st.length(); i++) {
28            ch = st.charAt(i);
29            if (stArr[ind].indexOf(ch) < 0) {
30                return false;
31            }
32        }
33        return true;
34    }
35}