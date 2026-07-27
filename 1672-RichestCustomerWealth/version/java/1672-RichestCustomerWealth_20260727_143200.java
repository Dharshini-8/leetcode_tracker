// Last updated: 7/27/2026, 2:32:00 PM
1class Solution {
2    public int maximumWealth(int[][] accounts) {
3        int max = 0;
4
5        for (int i = 0; i < accounts.length; i++) {
6            int sum = 0;
7
8            for (int j = 0; j < accounts[i].length; j++) {
9                sum += accounts[i][j];
10            }
11
12            if (sum > max) {
13                max = sum;
14            }
15        }
16
17        return max;
18    }
19}