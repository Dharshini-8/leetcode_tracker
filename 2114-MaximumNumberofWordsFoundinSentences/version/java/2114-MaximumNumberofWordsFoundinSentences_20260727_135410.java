// Last updated: 7/27/2026, 1:54:10 PM
1
2class Solution {
3    public int mostWordsFound(String[] sentences) {
4        int max = 0;
5
6        for (String s : sentences) {
7            int words = 1;
8
9            for (int i = 0; i < s.length(); i++) {
10                if (s.charAt(i) == ' ') {
11                    words++;
12                }
13            }
14
15            if (words > max) {
16                max = words;
17            }
18        }
19
20        return max;
21    }
22}