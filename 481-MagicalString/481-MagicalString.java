// Last updated: 08/09/2026, 10:08:06
1class Solution {
2    public int magicalString(int n) {
3        if (n==1)
4            return 1;
5        int[] a=new int[n+1];
6        a[0]=1;
7        a[1]=2;
8        a[2]=2;
9        int i=2,j=3,num=1,ones=1;
10        while(j<n){
11            for(int k=0;k<a[i]&&j<n;k++){
12                a[j++]=num;
13                if (num==1)
14                    ones++;
15            }
16            num=3-num;
17            i++;
18        }
19        return ones;
20    }
21}