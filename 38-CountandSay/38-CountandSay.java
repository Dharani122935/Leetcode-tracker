// Last updated: 09/07/2026, 18:16:22
1import java.util.*;
2class Solution {
3    public int maxFrequencyElements(int[] nums) {
4        int[] freq = new int[101];  // numbers are in range 1–100
5        for (int num : nums) {
6            freq[num]++;
7        }
8
9        int maxFreq = 0;
10        for (int f : freq) {
11            maxFreq = Math.max(maxFreq, f);
12        }
13
14        int result = 0;
15        for (int f : freq) {
16            if (f == maxFreq) {
17                result += f;
18            }
19        }
20
21        return result;
22    }
23}