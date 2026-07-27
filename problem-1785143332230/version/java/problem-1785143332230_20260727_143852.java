// Last updated: 7/27/2026, 2:38:52 PM
1class Solution {
2    public int[] minOperations(String boxes) {
3        int n = boxes.length();
4        int[] ans = new int[n];
5
6        for (int i = 0; i < n; i++) {
7            int moves = 0;
8            for (int j = 0; j < n; j++) {
9                if (boxes.charAt(j) == '1') {
10                    moves += Math.abs(i - j);
11                }
12            }
13            ans[i] = moves;
14        }
15
16        return ans;
17    }
18}