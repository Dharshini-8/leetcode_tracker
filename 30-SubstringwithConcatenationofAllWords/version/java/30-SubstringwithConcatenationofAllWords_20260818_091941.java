// Last updated: 8/18/2026, 9:19:41 AM
1import java.util.*;
2
3class Solution {
4    public List<Integer> findSubstring(String s, String[] words) {
5
6        List<Integer> result = new ArrayList<>();
7
8        int wordLen = words[0].length();
9        int wordCount = words.length;
10
11        HashMap<String, Integer> map = new HashMap<>();
12
13        for (String word : words) {
14            map.put(word, map.getOrDefault(word, 0) + 1);
15        }
16
17        for (int offset = 0; offset < wordLen; offset++) {
18
19            int left = offset;
20            int right = offset;
21            int count = 0;
22
23            HashMap<String, Integer> seen = new HashMap<>();
24
25            while (right + wordLen <= s.length()) {
26
27                String word = s.substring(right, right + wordLen);
28                right += wordLen;
29
30                if (!map.containsKey(word)) {
31                    seen.clear();
32                    count = 0;
33                    left = right;
34                    continue;
35                }
36
37                seen.put(word, seen.getOrDefault(word, 0) + 1);
38                count++;
39
40                while (seen.get(word) > map.get(word)) {
41                    String leftWord = s.substring(left, left + wordLen);
42
43                    seen.put(leftWord, seen.get(leftWord) - 1);
44
45                    left += wordLen;
46                    count--;
47                }
48
49                if (count == wordCount) {
50                    result.add(left);
51
52                    String leftWord = s.substring(left, left + wordLen);
53                    seen.put(leftWord, seen.get(leftWord) - 1);
54
55                    left += wordLen;
56                    count--;
57                }
58            }
59        }
60
61        return result;
62    }
63}