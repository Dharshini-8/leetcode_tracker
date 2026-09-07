// Last updated: 9/7/2026, 2:02:04 PM
1class Solution {
2    public int distinctSubseqII(String s) {
3        final int MOD = 1000000007;
4        long[] dp = new long[s.length() + 1];
5
6        dp[0] = 1; 
7        
8        int[] last = new int[26];
9
10        for (int i = 1; i <= s.length(); i++) {
11            char ch = s.charAt(i - 1);
12            int index = ch - 'a';
13            dp[i] = (2 * dp[i - 1]) % MOD;
14            if (last[index] != 0) {
15                dp[i] = (dp[i] - dp[last[index] - 1] + MOD) % MOD;
16            }
17
18            last[index] = i;
19        }
20        return (int) ((dp[s.length()] - 1 + MOD) % MOD);
21    }
22}