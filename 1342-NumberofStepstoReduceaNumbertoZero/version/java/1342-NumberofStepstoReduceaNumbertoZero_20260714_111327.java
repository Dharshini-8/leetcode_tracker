// Last updated: 7/14/2026, 11:13:27 AM
1class Solution {
2    public int numberOfSteps(int num) {
3        int count = 0;
4
5        while (num > 0) {
6            if (num % 2 == 0) {
7                num = num / 2;
8            } else {
9                num = num - 1;
10            }
11            count++;
12        }
13
14        return count;
15    }
16}