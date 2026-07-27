// Last updated: 7/27/2026, 9:50:52 AM
1class Solution {
2    public int countDigits(int num) {
3        
4    int n = num;
5        int count = 0;
6
7        while (n > 0) {
8            int digit = n % 10;
9
10            if (num % digit == 0) {
11                count++;
12            }
13
14            n /= 10;
15        }
16
17        return count;
18    }
19}