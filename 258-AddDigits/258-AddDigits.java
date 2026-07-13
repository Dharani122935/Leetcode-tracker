// Last updated: 13/07/2026, 10:11:45
class Solution {
    public int addDigits(int num) {
        int sum=0;
        if(num==0){
            return 0;
        }
        else{
            while(num>0){
                int d=num%10;
                sum=sum+d;
                num=num/10;
            }
        }
        if(sum>=10){
            return addDigits(sum);
             }
         return sum;
    }
}