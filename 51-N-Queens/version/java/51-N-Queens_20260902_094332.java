// Last updated: 9/2/2026, 9:43:32 AM
1class Solution {
2    public List<List<String>> solveNQueens(int n) {
3        List<List<String>> result = new ArrayList<>();
4
5        char[][] board = new char[n][n];
6
7        for (int i = 0; i < n; i++) {
8            Arrays.fill(board[i], '.');
9        }
10
11        solve(0, n, board, result);
12
13        return result;
14    }
15
16    void solve(int row, int n, char[][] board,
17               List<List<String>> result) {
18
19        if (row == n) {
20            List<String> list = new ArrayList<>();
21
22            for (int i = 0; i < n; i++) {
23                list.add(new String(board[i]));
24            }
25
26            result.add(list);
27            return;
28        }
29
30        for (int col = 0; col < n; col++) {
31
32            if (isSafe(row, col, n, board)) {
33
34                board[row][col] = 'Q';
35
36                solve(row + 1, n, board, result);
37
38                board[row][col] = '.';
39            }
40        }
41    }
42
43    boolean isSafe(int row, int col, int n, char[][] board) {
44
45        for (int i = 0; i < row; i++) {
46            if (board[i][col] == 'Q') {
47                return false;
48            }
49        }
50        for (int i = row - 1, j = col - 1;
51             i >= 0 && j >= 0; i--, j--) {
52
53            if (board[i][j] == 'Q') {
54                return false;
55            }
56        }
57        for (int i = row - 1, j = col + 1;
58             i >= 0 && j < n; i--, j++) {
59
60            if (board[i][j] == 'Q') {
61                return false;
62            }
63        }
64
65        return true;
66    }
67}