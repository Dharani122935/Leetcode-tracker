// Last updated: 09/07/2026, 17:58:24
1class Solution {
2    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
3        int ans[]=new int[nums1.length];
4        for(int i=0;i<nums1.length;i++) {
5            int j=0;
6            while(j<nums2.length && nums2[j]!=nums1[i]) j++;
7            while(j<nums2.length && nums2[j]<=nums1[i]) j++;
8            if(j==nums2.length) ans[i]=-1;
9            else ans[i]=nums2[j];
10        }
11        return ans;
12    }
13}