// Last updated: 8/3/2026, 2:09:24 PM
1import java.util.HashMap;
2
3class Solution {
4    public int countWords(String[] words1, String[] words2) {
5
6        HashMap<String, Integer> map1 = new HashMap<>();
7        HashMap<String, Integer> map2 = new HashMap<>();
8
9        for (String word : words1) {
10            map1.put(word, map1.getOrDefault(word, 0) + 1);
11        }
12
13        for (String word : words2) {
14            map2.put(word, map2.getOrDefault(word, 0) + 1);
15        }
16
17        int count = 0;
18
19        for (String word : map1.keySet()) {
20            if (map1.get(word) == 1 && map2.getOrDefault(word, 0) == 1) {
21                count++;
22            }
23        }
24
25        return count;
26    }
27}