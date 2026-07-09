// Last updated: 09/07/2026, 09:18:15
class Solution {
    public boolean isHappy(int n) {
        int d,sum;
        while(n!=1 &&n!=4)
        {
            sum=0;
            while(n!=0)//82
            {
                d=n%10;
                sum=sum+(d*d);
                n=n/10;
            }
            n=sum;
        }
        if(n==1)
    return true;
    else
    return false;
    } 
}