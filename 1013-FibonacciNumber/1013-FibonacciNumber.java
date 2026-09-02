// Last updated: 02/09/2026, 09:50:03
class Solution {
    public int fib(int n) {
        if(n<=1){
            return n;
        }int a=0;
        int b=1;
        for(int i=2;i<=n;i++){
            int c=a+b;
            a=b;
            b=c;
        }return b;
    }
}