// Last updated: 7/27/2026, 2:20:12 PM
1class Solution {
2    public int[] buildArray(int[] nums) {
3        int[] ans = new int[nums.length];
4
5        for (int i = 0; i < nums.length; i++) {
6            ans[i] = nums[nums[i]];
7        }
8
9        return ans;
10    }
11}