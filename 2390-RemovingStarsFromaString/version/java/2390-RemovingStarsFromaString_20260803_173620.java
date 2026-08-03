// Last updated: 8/3/2026, 5:36:20 PM
1import java.util.Stack;
2
3class Solution {
4    public String removeStars(String s) {
5
6        Stack<Character> stack = new Stack<>();
7
8        for (char ch : s.toCharArray()) {
9
10            if (ch == '*') {
11                stack.pop();
12            } else {
13                stack.push(ch);
14            }
15        }
16
17        StringBuilder ans = new StringBuilder();
18
19        for (char ch : stack) {
20            ans.append(ch);
21        }
22
23        return ans.toString();
24    }
25}