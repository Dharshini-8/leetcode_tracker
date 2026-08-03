// Last updated: 8/3/2026, 5:40:02 PM
1class Solution {
2    public int minDeletion(int[] nums) {
3
4        int delete = 0;
5        int size = 0;
6
7        for (int i = 0; i < nums.length; i++) {
8
9            if (size % 2 == 0) {
10
11                if (i + 1 < nums.length && nums[i] == nums[i + 1]) {
12                    delete++;
13                } else {
14                    size++;
15                }
16
17            } else {
18                size++;
19            }
20        }
21
22        if (size % 2 == 1) {
23            delete++;
24        }
25
26        return delete;
27    }
28}