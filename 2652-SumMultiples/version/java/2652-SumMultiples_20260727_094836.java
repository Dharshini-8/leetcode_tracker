// Last updated: 7/27/2026, 9:48:36 AM
1class Solution {
2    public int sumOfMultiples(int n) {
3      int sum = 0;
4
5        for (int i = 1; i <= n; i++) {
6            if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
7                sum += i;
8            }
9        }
10
11        return sum;
12    }
13}