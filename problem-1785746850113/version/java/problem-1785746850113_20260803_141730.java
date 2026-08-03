// Last updated: 8/3/2026, 2:17:30 PM
1class Solution {
2    public int equalPairs(int[][] grid) {
3
4        int n = grid.length;
5        int count = 0;
6
7        for (int i = 0; i < n; i++) {         
8            for (int j = 0; j < n; j++) {     
9
10                boolean same = true;
11
12                for (int k = 0; k < n; k++) {
13                    if (grid[i][k] != grid[k][j]) {
14                        same = false;
15                        break;
16                    }
17                }
18
19                if (same)
20                    count++;
21            }
22        }
23
24        return count;
25    }
26}