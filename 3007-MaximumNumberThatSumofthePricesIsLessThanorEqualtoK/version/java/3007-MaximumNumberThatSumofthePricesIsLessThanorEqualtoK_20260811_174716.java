// Last updated: 8/11/2026, 5:47:16 PM
1class Solution {
2    long k;
3    int x;
4    long num;
5    Long[][] dp;
6
7    public long findMaximumNumber(long k, int x) {
8        this.k = k;
9        this.x = x;
10
11        long low = 1;
12        long high = 100000000000000000L; // 1e17
13
14        while (low < high) {
15            long mid = low + (high - low + 1) / 2;
16
17            num = mid;
18            dp = new Long[65][65];
19
20            int bits = 64 - Long.numberOfLeadingZeros(mid);
21
22            long price = dfs(bits, 0, true);
23
24            if (price <= k) {
25                low = mid;
26            } else {
27                high = mid - 1;
28            }
29        }
30
31        return low;
32    }
33
34    private long dfs(int pos, int count, boolean limit) {
35
36        if (pos == 0) {
37            return count;
38        }
39
40        if (!limit && dp[pos][count] != null) {
41            return dp[pos][count];
42        }
43
44        int up;
45
46        if (limit) {
47            up = (int) ((num >> (pos - 1)) & 1);
48        } else {
49            up = 1;
50        }
51
52        long ans = 0;
53
54        for (int bit = 0; bit <= up; bit++) {
55
56            int newCount = count;
57
58            // Positions are counted from right to left
59            if (bit == 1 && pos % x == 0) {
60                newCount++;
61            }
62
63            ans += dfs(
64                pos - 1,
65                newCount,
66                limit && bit == up
67            );
68        }
69
70        if (!limit) {
71            dp[pos][count] = ans;
72        }
73
74        return ans;
75    }
76}