// Last updated: 8/24/2026, 9:08:56 AM
1class Solution {
2    public int stoneGameVIII(int[] stones) {
3        int n = stones.length;
4
5        long[] prefix = new long[n];
6
7        prefix[0] = stones[0];
8
9        for (int i = 1; i < n; i++) {
10            prefix[i] = prefix[i - 1] + stones[i];
11        }
12
13        long dp = prefix[n - 1];
14
15        for (int i = n - 2; i >= 1; i--) {
16            dp = Math.max(dp, prefix[i] - dp);
17        }
18
19        return (int) dp;
20    }
21}