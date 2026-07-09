// Last updated: 09/07/2026, 18:27:07
1class Solution {
2    public int countPrimes(int n) {
3    int count=0;
4     boolean[] prime=new boolean[n+1];
5     for(int i=0;i<n;i++){
6        prime[i]=true;
7     }
8     for(int p=2;p*p<=n;p++){
9        if(prime[p]){
10            for(int i=p*p;i<=n;i+=p){
11                prime[i]=false;
12            }
13        }
14     }
15     for(int p=2;p<=n;p++){
16        if(prime[p]){
17            count++;
18        }
19     }
20     return count;
21
22    }
23}