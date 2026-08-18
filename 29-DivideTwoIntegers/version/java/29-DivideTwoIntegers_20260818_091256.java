// Last updated: 8/18/2026, 9:12:56 AM
1class Solution {
2    public int divide(int dividend, int divisor) {
3
4        if (dividend == Integer.MIN_VALUE && divisor == -1) {
5            return Integer.MAX_VALUE;
6        }
7
8        boolean negative = (dividend < 0) ^ (divisor < 0);
9        long a = Math.abs((long) dividend);
10        long b = Math.abs((long) divisor);
11
12        int result = 0;
13
14        while (a >= b) {
15
16            long temp = b;
17            int count = 1;
18
19            // Keep doubling divisor
20            while (a >= (temp << 1)) {
21                temp = temp << 1;
22                count = count << 1;
23            }
24
25            a = a - temp;
26            result = result + count;
27        }
28
29        return negative ? -result : result;
30    }
31}