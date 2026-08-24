// Last updated: 8/24/2026, 9:23:36 AM
1class Solution {
2    public boolean exist(char[][] board, String word) {
3
4        for (int i = 0; i < board.length; i++) {
5            for (int j = 0; j < board[0].length; j++) {
6
7                if (dfs(board, word, i, j, 0)) {
8                    return true;
9                }
10            }
11        }
12
13        return false;
14    }
15
16    boolean dfs(char[][] board, String word, int i, int j, int index) {
17
18        if (index == word.length()) {
19            return true;
20        }
21
22        if (i < 0 || i >= board.length ||
23            j < 0 || j >= board[0].length ||
24            board[i][j] != word.charAt(index)) {
25            return false;
26        }
27
28        char temp = board[i][j];
29        board[i][j] = '#';
30
31        boolean found =
32            dfs(board, word, i + 1, j, index + 1) ||
33            dfs(board, word, i - 1, j, index + 1) ||
34            dfs(board, word, i, j + 1, index + 1) ||
35            dfs(board, word, i, j - 1, index + 1);
36
37        board[i][j] = temp;
38
39        return found;
40    }
41}