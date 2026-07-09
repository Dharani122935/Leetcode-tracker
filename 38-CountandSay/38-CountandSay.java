// Last updated: 09/07/2026, 18:30:27
1class Solution {
2    public int addDigits(int num) {
3        int sum=0;
4        if(num==0){
5            return 0;
6        }
7        else{
8            while(num>0){
9                int d=num%10;
10                sum=sum+d;
11                num=num/10;
12            }
13        }
14        if(sum>=10){
15            return addDigits(sum);
16             }
17         return sum;
18    }
19}