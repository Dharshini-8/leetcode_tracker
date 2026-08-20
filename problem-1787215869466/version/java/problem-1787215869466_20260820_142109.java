// Last updated: 8/20/2026, 2:21:09 PM
1class Solution {
2    public int minPathSum(int[][] grid) {
3        int m = grid.length;
4        int n = grid[0].length;
5
6        for (int i = 0; i < m; i++) {
7            for (int j = 0; j < n; j++) {
8
9                if (i == 0 && j == 0) {
10                    continue;
11                }
12
13                if (i == 0) {
14                    grid[i][j] += grid[i][j - 1];
15                } 
16                else if (j == 0) {
17                    grid[i][j] += grid[i - 1][j];
18                } 
19                else {
20                    grid[i][j] += Math.min(grid[i - 1][j], grid[i][j - 1]);
21                }
22            }
23        }
24
25        return grid[m - 1][n - 1];
26    }
27}