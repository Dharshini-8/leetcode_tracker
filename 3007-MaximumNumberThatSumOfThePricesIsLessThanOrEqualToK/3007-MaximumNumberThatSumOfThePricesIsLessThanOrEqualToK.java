// Last updated: 9/12/2026, 2:15:22 PM
class Solution {
    long k;
    int x;
    long num;
    Long[][] dp;

    public long findMaximumNumber(long k, int x) {
        this.k = k;
        this.x = x;

        long low = 1;
        long high = 100000000000000000L; // 1e17

        while (low < high) {
            long mid = low + (high - low + 1) / 2;

            num = mid;
            dp = new Long[65][65];

            int bits = 64 - Long.numberOfLeadingZeros(mid);

            long price = dfs(bits, 0, true);

            if (price <= k) {
                low = mid;
            } else {
                high = mid - 1;
            }
        }

        return low;
    }

    private long dfs(int pos, int count, boolean limit) {

        if (pos == 0) {
            return count;
        }

        if (!limit && dp[pos][count] != null) {
            return dp[pos][count];
        }

        int up;

        if (limit) {
            up = (int) ((num >> (pos - 1)) & 1);
        } else {
            up = 1;
        }

        long ans = 0;

        for (int bit = 0; bit <= up; bit++) {

            int newCount = count;

            // Positions are counted from right to left
            if (bit == 1 && pos % x == 0) {
                newCount++;
            }

            ans += dfs(
                pos - 1,
                newCount,
                limit && bit == up
            );
        }

        if (!limit) {
            dp[pos][count] = ans;
        }

        return ans;
    }
}