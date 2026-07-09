// Last updated: 09/07/2026, 18:00:05
1class Solution {
2    public int[][] modifiedMatrix(int[][] matrix) {
3        int r = matrix.length;
4        int c = matrix[0].length;
5
6        for (int j = 0; j < c; j++) {
7            int max = Integer.MIN_VALUE;
8
9            // 1. Find max in column j
10            for (int i = 0; i < r; i++) {
11                if (matrix[i][j] != -1) {
12                    max = Math.max(max, matrix[i][j]);
13                }
14            }
15
16            // 2. Replace all -1 with max
17            for (int i = 0; i < r; i++) {
18                if (matrix[i][j] == -1) {
19                    matrix[i][j] = max;
20                }
21            }
22        }
23
24        return matrix;
25    }
26}