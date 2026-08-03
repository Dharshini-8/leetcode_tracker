// Last updated: 8/3/2026, 2:05:27 PM
1import java.util.Arrays;
2
3class Solution {
4
5    public int[] successfulPairs(int[] spells, int[] potions, long success) {
6
7        Arrays.sort(potions);
8
9        int n = potions.length;
10        int[] ans = new int[spells.length];
11
12        for (int i = 0; i < spells.length; i++) {
13
14            int left = 0;
15            int right = n - 1;
16
17            while (left <= right) {
18
19                int mid = left + (right - left) / 2;
20
21                if ((long) spells[i] * potions[mid] >= success) {
22                    right = mid - 1;
23                } else {
24                    left = mid + 1;
25                }
26            }
27
28            ans[i] = n - left;
29        }
30
31        return ans;
32    }
33}