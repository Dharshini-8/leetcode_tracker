// Last updated: 9/2/2026, 9:47:59 AM
1class Solution {
2    public boolean uniformArray(int[] nums1) {
3        boolean odd = false;
4        boolean even = false;
5
6        for (int num : nums1) {
7            if (num % 2 == 0)
8                even = true;
9            else
10                odd = true;
11        }
12
13        return true;
14    }
15}