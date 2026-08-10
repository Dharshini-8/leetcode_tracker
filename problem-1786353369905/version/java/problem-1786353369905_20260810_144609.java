// Last updated: 8/10/2026, 2:46:09 PM
1import java.util.*;
2
3class Solution {
4    public int longestSquareStreak(int[] nums) {
5        HashSet<Integer> set = new HashSet<>();
6
7        for (int n : nums) {
8            set.add(n);
9        }
10
11        int ans = -1;
12
13        for (int n : nums) {
14            int count = 1;
15            long x = n;
16
17            while (x * x <= 100000) {
18                x = x * x;
19
20                if (set.contains((int)x)) {
21                    count++;
22                } else {
23                    break;
24                }
25            }
26
27            if (count >= 2) {
28                ans = Math.max(ans, count);
29            }
30        }
31
32        return ans;
33    }
34}