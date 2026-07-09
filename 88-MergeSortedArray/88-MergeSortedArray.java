// Last updated: 09/07/2026, 09:18:36

class Solution {
    //readysync
    public void merge(int[] nums1, int m, int[] nums2, int n) {
         int res[]=new int[m+n];
        for(int i=0;i<m;i++)
            res[i]=nums1[i];
        

        for(int j=0;j<n;j++)
            res[m+j]=nums2[j];
        
        Arrays.sort(res);

        for(int i=0;i<m+n;i++)
            nums1[i]=res[i];
        
    }
}