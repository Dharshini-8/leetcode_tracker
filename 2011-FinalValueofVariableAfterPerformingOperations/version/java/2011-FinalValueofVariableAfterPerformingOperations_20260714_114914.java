// Last updated: 7/14/2026, 11:49:14 AM
1class Solution {
2    public int finalValueAfterOperations(String[] operations) {
3        int x = 0;
4
5        for (String op : operations) {
6            if (op.contains("++")) {
7                x++;
8            } else {
9                x--;
10            }
11        }
12
13        return x;
14    }
15}