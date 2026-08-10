// Last updated: 8/10/2026, 2:52:07 PM
1class Solution {
2    public int captureForts(int[] forts) {
3        int ans = 0;
4
5        for (int i = 0; i < forts.length; i++) {
6
7            if (forts[i] == 1) {
8
9            
10                int j = i + 1;
11
12                while (j < forts.length && forts[j] == 0) {
13                    j++;
14                }
15
16                if (j < forts.length && forts[j] == -1) {
17                    ans = Math.max(ans, j - i - 1);
18                }
19
20            
21                j = i - 1;
22
23                while (j >= 0 && forts[j] == 0) {
24                    j--;
25                }
26
27                if (j >= 0 && forts[j] == -1) {
28                    ans = Math.max(ans, i - j - 1);
29                }
30            }
31        }
32
33        return ans;
34    }
35}