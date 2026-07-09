// Last updated: 7/9/2026, 6:13:19 PM
1class Solution {
2    public int firstUniqChar(String s) {
3
4        int[] freq = new int[26];
5
6        for (int i = 0; i < s.length(); i++) {
7            freq[s.charAt(i) - 'a']++;
8        }
9
10        for (int i = 0; i < s.length(); i++) {
11            if (freq[s.charAt(i) - 'a'] == 1) {
12                return i;
13            }
14        }
15
16        return -1;
17    }
18}