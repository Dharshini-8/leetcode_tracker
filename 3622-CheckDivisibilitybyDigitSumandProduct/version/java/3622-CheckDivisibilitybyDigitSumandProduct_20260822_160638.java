// Last updated: 8/22/2026, 4:06:38 PM
1class Solution {
2    public boolean checkDivisibility(int n) {
3        int temp = n;
4        int sum = 0;
5        int product = 1;
6
7        while (temp > 0) {
8            int digit = temp % 10;
9
10            sum += digit;
11            product *= digit;
12
13            temp /= 10;
14        }
15
16        int total = sum + product;
17
18        return n % total == 0;
19    }
20}