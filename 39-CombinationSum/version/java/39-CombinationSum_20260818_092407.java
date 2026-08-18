// Last updated: 8/18/2026, 9:24:07 AM
1import java.util.*;
2
3class Solution {
4    public List<List<Integer>> combinationSum(int[] candidates, int target) {
5        List<List<Integer>> result = new ArrayList<>();
6        backtrack(candidates, target, 0, new ArrayList<>(), result);
7        return result;
8    }
9
10    void backtrack(int[] candidates, int target, int index,
11                    List<Integer> current, List<List<Integer>> result) {
12
13        if (target == 0) {
14            result.add(new ArrayList<>(current));
15            return;
16        }
17
18        if (target < 0) {
19            return;
20        }
21
22        for (int i = index; i < candidates.length; i++) {
23
24            if (candidates[i] > target) {
25                continue;
26            }
27
28            current.add(candidates[i]);
29
30            backtrack(candidates, target - candidates[i],
31                      i, current, result);
32
33            current.remove(current.size() - 1);
34        }
35    }
36}