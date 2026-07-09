// Last updated: 7/9/2026, 6:17:03 PM
1class Solution {
2    public String licenseKeyFormatting(String s, int k) {
3
4        StringBuilder sb = new StringBuilder();
5
6        for (int i = s.length() - 1; i >= 0; i--) {
7
8            char ch = s.charAt(i);
9
10            if (ch == '-') {
11                continue;
12            }
13
14            if (sb.length() % (k + 1) == k) {
15                sb.append('-');
16            }
17
18            sb.append(Character.toUpperCase(ch));
19        }
20
21        return sb.reverse().toString();
22    }
23}