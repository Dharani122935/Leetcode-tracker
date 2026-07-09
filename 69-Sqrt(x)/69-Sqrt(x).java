// Last updated: 09/07/2026, 22:29:31
1class Solution {
2    public int mySqrt(int x) {
3        if(x==0 || x==1)
4            return x;
5        int left=1;
6        int right=x;
7        int ans=0;
8        while(left<=right){
9            int mid=left+(right-left)/2;
10            if((long)mid*mid<=x){
11                ans=mid;
12                left=mid+1;
13            }
14            else{
15                right=mid-1;
16            }
17        }
18        return ans;
19    }
20}