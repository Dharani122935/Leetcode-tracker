// Last updated: 15/07/2026, 10:00:22
1import java.util.*;
2class Solution{
3    public boolean containsNearbyDuplicate(int[] nums,int k){
4        HashMap<Integer,Integer> map=new HashMap<>();
5        for(int i=0;i<nums.length;i++){
6            if(map.containsKey(nums[i]) && i-map.get(nums[i])<=k)
7                return true;
8            map.put(nums[i],i);
9        }
10        return false;
11    }
12}