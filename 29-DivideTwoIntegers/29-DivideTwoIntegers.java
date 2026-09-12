// Last updated: 9/12/2026, 2:23:17 PM
class Solution {
    public int divide(int dividend, int divisor) {

        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        boolean negative = (dividend < 0) ^ (divisor < 0);
        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);

        int result = 0;

        while (a >= b) {

            long temp = b;
            int count = 1;

            // Keep doubling divisor
            while (a >= (temp << 1)) {
                temp = temp << 1;
                count = count << 1;
            }

            a = a - temp;
            result = result + count;
        }

        return negative ? -result : result;
    }
}