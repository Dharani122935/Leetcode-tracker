// Last updated: 09/07/2026, 18:25:36
1class Solution {
2    public int maxPoints(int[][] points) {
3        int max=0;
4        for(int[] x:points){
5            Map<Double,Integer> map=new HashMap<>();
6            for(int[]y:points){
7                if(x==y)
8                    continue;
9                    double slope=0;
10                    if(y[0]-x[0]==0)
11                        slope=Double.POSITIVE_INFINITY;
12                    else
13                        slope=(y[1]-x[1])/(double)(y[0]-x[0]);
14                    map.put(slope,map.getOrDefault(slope,0)+1);
15                    max=Math.max(max,map.get(slope));
16       
17                
18            }
19        }
20        return max+1;
21    }
22}