// Last updated: 09/07/2026, 22:13:27
1class Solution {
2    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
3        int m=nums1.length;
4        int n=nums2.length;
5        int p=m+n;
6        int m1=(p-1)/2;
7        int m2=p/2;
8
9        int i=0,j=0,count=0;
10        int current=0,previous=0;
11
12        while(count<=m2){
13            previous=current;
14            if(i<m&&(j>=n||nums1[i]<=nums2[j])){
15                current=nums1[i++];
16            }
17            else{
18                current=nums2[j++];
19            }
20            count++;
21        }
22        if(p%2==0){
23            return(previous+current)/2.0;
24        }
25        else{
26            return current;
27        }
28
29    }
30}