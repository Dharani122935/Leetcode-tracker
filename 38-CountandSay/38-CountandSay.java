// Last updated: 09/07/2026, 18:19:02
1import java.util.HashSet;
2
3public class Solution {
4    public boolean checkIfExist(int[] arr) {
5        HashSet<Integer> set = new HashSet<>();
6        for (int num : arr) {
7            if (set.contains(num * 2) || (num % 2 == 0 && set.contains(num / 2))) {
8                return true;
9            }
10            set.add(num);
11        }
12        return false;
13    }
14}