// Last updated: 8/10/2026, 2:47:57 PM
1import java.util.*;
2
3class Solution {
4    public int similarPairs(String[] words) {
5        int count = 0;
6
7        for (int i = 0; i < words.length; i++) {
8            for (int j = i + 1; j < words.length; j++) {
9
10                HashSet<Character> a = new HashSet<>();
11                HashSet<Character> b = new HashSet<>();
12
13                for (char c : words[i].toCharArray())
14                    a.add(c);
15
16                for (char c : words[j].toCharArray())
17                    b.add(c);
18
19                if (a.equals(b))
20                    count++;
21            }
22        }
23
24        return count;
25    }
26}