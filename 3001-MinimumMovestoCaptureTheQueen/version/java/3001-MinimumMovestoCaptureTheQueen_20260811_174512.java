// Last updated: 8/11/2026, 5:45:12 PM
1class Solution {
2    public int minMovesToCaptureTheQueen(int a, int b, int c, int d, int e, int f) {
3
4        if (a == e) {
5            if (!(c == a && d > Math.min(b, f) && d < Math.max(b, f))) {
6                return 1;
7            }
8        }
9        if (b == f) {
10            if (!(d == b && c > Math.min(a, e) && c < Math.max(a, e))) {
11                return 1;
12            }
13        }
14
15        if (Math.abs(c - e) == Math.abs(d - f)) {
16
17        
18            if (!(Math.abs(c - a) == Math.abs(d - b) &&
19                  Math.abs(a - e) == Math.abs(b - f) &&
20                  Math.min(c, e) < a && a < Math.max(c, e))) {
21                return 1;
22            }
23        }
24
25        return 2;
26    }
27}