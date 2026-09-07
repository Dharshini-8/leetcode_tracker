// Last updated: 9/7/2026, 2:04:43 PM
1import java.util.Arrays;
2
3class Solution {
4    public int threeSumClosest(int[] nums, int target) {
5
6        Arrays.sort(nums);
7
8        int closest = nums[0] + nums[1] + nums[2];
9
10        for (int i = 0; i < nums.length - 2; i++) {
11
12            int left = i + 1;
13            int right = nums.length - 1;
14
15            while (left < right) {
16
17                int sum = nums[i] + nums[left] + nums[right];
18                if (Math.abs(sum - target) < Math.abs(closest - target)) {
19                    closest = sum;
20                }
21                if (sum == target) {
22                    return sum;
23                }
24
25                if (sum < target) {
26                    left++;
27                } else {
28                    right--;
29                }
30            }
31        }
32
33        return closest;
34    }
35}