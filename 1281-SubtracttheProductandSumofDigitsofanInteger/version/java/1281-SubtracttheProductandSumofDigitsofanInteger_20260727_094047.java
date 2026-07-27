// Last updated: 7/27/2026, 9:40:47 AM
1class Solution {
2    public int subtractProductAndSum(int n) {
3        int product = 1;
4        int sum = 0;
5
6        while (n > 0) {
7            int digit = n % 10;
8            product *= digit;
9            sum += digit;
10            n /= 10;
11        }
12
13        return product - sum;
14    }
15}