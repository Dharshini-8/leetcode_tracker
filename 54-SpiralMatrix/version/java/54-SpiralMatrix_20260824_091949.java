// Last updated: 8/24/2026, 9:19:49 AM
1class Solution {
2    public List<Integer> spiralOrder(int[][] matrix) {
3        List<Integer> result = new ArrayList<>();
4
5        int top = 0;
6        int bottom = matrix.length - 1;
7        int left = 0;
8        int right = matrix[0].length - 1;
9
10        while (top <= bottom && left <= right) {
11
12            for (int i = left; i <= right; i++) {
13                result.add(matrix[top][i]);
14            }
15            top++;
16
17            for (int i = top; i <= bottom; i++) {
18                result.add(matrix[i][right]);
19            }
20            right--;
21
22            if (top <= bottom) {
23                for (int i = right; i >= left; i--) {
24                    result.add(matrix[bottom][i]);
25                }
26                bottom--;
27            }
28
29            if (left <= right) {
30                for (int i = bottom; i >= top; i--) {
31                    result.add(matrix[i][left]);
32                }
33                left++;
34            }
35        }
36
37        return result;
38    }
39}