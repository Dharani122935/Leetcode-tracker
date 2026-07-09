// Last updated: 09/07/2026, 22:31:15
1import java.util.*;
2
3class Solution {
4    public List<Integer> getRow(int rowIndex) {
5        List<Integer> row = new ArrayList<>();
6
7        long value = 1;
8
9        for(int i = 0; i <= rowIndex; i++) {
10            row.add((int)value);
11            value = value * (rowIndex - i) / (i + 1);
12        }
13
14        return row;
15    }
16}