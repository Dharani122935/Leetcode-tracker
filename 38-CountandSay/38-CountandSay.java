// Last updated: 09/07/2026, 18:26:20
1class Solution {
2    public boolean checkStraightLine(int[][] coordinates) {
3        int x0=coordinates[0][0],y0=coordinates[0][1];
4        int x1=coordinates[1][0],y1=coordinates[1][1];
5        for(int i=2;i<coordinates.length;i++){
6            int x2=coordinates[i][0],y2=coordinates[i][1];
7            if((y1-y0)*(x2-x1)!=(y2-y1)*(x1-x0)){
8                return false;
9            }
10        }
11        return true;
12    }
13}