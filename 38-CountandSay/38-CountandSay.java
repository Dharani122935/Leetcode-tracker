// Last updated: 09/07/2026, 18:01:49
1import java.util.ArrayList;
2import java.util.List;
3
4class Solution {
5    public List<List<Integer>> generate(int numRows) {
6        List<List<Integer>> result = new ArrayList<>();
7        if (numRows == 0) {
8            return result;
9        }
10
11        if (numRows == 1) {
12            List<Integer> firstRow = new ArrayList<>();
13            firstRow.add(1);
14            result.add(firstRow);
15            return result;
16        }
17
18        result = generate(numRows - 1);
19        List<Integer> prevRow = result.get(numRows - 2);
20        List<Integer> currentRow = new ArrayList<>();
21        currentRow.add(1);
22
23        for (int i = 1; i < numRows - 1; i++) {
24            currentRow.add(prevRow.get(i - 1) + prevRow.get(i));
25        }
26
27        currentRow.add(1);
28        result.add(currentRow);
29
30        return result;
31    }
32}