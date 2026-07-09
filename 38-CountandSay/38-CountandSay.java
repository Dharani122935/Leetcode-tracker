// Last updated: 09/07/2026, 18:21:26
1class Solution {
2    public boolean uniqueOccurrences(int[] arr) {
3        Arrays.sort(arr);
4        Set<Integer> st = new HashSet<>();
5        int i = 0 , cnt = 0;
6
7        while(i < arr.length) {
8            int j = i;
9            while(j + 1 < arr.length && arr[j + 1] == arr[j]) {
10                j++;
11            }
12            int freq = j - i + 1;
13            st.add(freq);
14            cnt++;
15            i = j + 1;
16        }
17        return st.size() == cnt;
18    }
19}