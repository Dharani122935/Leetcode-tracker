// Last updated: 09/07/2026, 22:09:28
1class Solution {
2    public int[] sortArray(int[] nums) {
3        quick(nums, 0, nums.length - 1);
4        return nums;
5    }
6
7    static void quick(int[] nums, int low, int high) {
8        if (low >= high) return;
9
10        int i = low;
11        int j = high;
12        int mid = (i + j) / 2;
13        int pivot = nums[mid]; 
14        while (i <= j) {
15            while (nums[i] < pivot) {
16                i++;
17            }
18            while (nums[j] > pivot) {
19                j--;
20            }
21
22            if (i <= j) {
23                int temp = nums[i];
24                nums[i] = nums[j];
25                nums[j] = temp;
26                i++;
27                j--;
28            }
29        }
30        quick(nums, low, j);
31        quick(nums, i, high);
32    }
33}