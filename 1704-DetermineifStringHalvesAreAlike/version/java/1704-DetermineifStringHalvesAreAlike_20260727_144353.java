// Last updated: 7/27/2026, 2:43:53 PM
1class Solution {
2    public boolean halvesAreAlike(String s) {
3        String vowels = "aeiouAEIOU";
4        int count = 0;
5
6        for (int i = 0; i < s.length() / 2; i++) {
7            if (vowels.indexOf(s.charAt(i)) != -1)
8                count++;
9        }
10
11        for (int i = s.length() / 2; i < s.length(); i++) {
12            if (vowels.indexOf(s.charAt(i)) != -1)
13                count--;
14        }
15
16        return count == 0;
17    }
18}