// Last updated: 7/27/2026, 2:45:30 PM
1class Solution {
2    public boolean makeEqual(String[] words) {
3        int[] count = new int[26];
4
5        for (String word : words) {
6            for (char c : word.toCharArray()) {
7                count[c - 'a']++;
8            }
9        }
10
11        for (int c : count) {
12            if (c % words.length != 0)
13                return false;
14        }
15
16        return true;
17    }
18}