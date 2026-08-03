// Last updated: 8/3/2026, 1:58:13 PM
1class Solution {
2    public int maximumDifference(int[] nums) {
3
4        int min = nums[0];
5        int maxDiff = -1;
6
7        for (int i = 1; i < nums.length; i++) {
8
9            if (nums[i] > min) {
10                maxDiff = Math.max(maxDiff, nums[i] - min);
11            } else {
12                min = nums[i];
13            }
14        }
15
16        return maxDiff;
17    }
18}