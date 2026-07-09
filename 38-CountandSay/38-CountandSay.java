// Last updated: 09/07/2026, 18:11:45
1class Solution {
2    public List<Integer> findDisappearedNumbers(int[] nums) {
3        List<Integer> result = new ArrayList<>();
4		boolean[] n = new boolean[nums.length+1];
5		for(int num : nums) {
6			n[num] = true;
7		}
8		
9		for(int i=1; i<=nums.length; i++) {
10			if(!n[i]) result.add(i);
11		}
12        return result;
13    }
14}