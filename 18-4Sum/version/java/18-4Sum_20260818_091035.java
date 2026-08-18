// Last updated: 8/18/2026, 9:10:35 AM
1import java.util.*;
2
3class Solution {
4    public List<List<Integer>> fourSum(int[] nums, int target) {
5
6        List<List<Integer>> result = new ArrayList<>();
7
8        Arrays.sort(nums);
9
10        for (int i = 0; i < nums.length - 3; i++) {
11
12            if (i > 0 && nums[i] == nums[i - 1])
13                continue;
14
15            for (int j = i + 1; j < nums.length - 2; j++) {
16
17                if (j > i + 1 && nums[j] == nums[j - 1])
18                    continue;
19
20                int left = j + 1;
21                int right = nums.length - 1;
22
23                while (left < right) {
24
25                    long sum = (long) nums[i] + nums[j]
26                             + nums[left] + nums[right];
27
28                    if (sum == target) {
29
30                        result.add(Arrays.asList(
31                            nums[i], nums[j], nums[left], nums[right]
32                        ));
33
34                        while (left < right && nums[left] == nums[left + 1])
35                            left++;
36
37                        while (left < right && nums[right] == nums[right - 1])
38                            right--;
39
40                        left++;
41                        right--;
42
43                    } else if (sum < target) {
44                        left++;
45                    } else {
46                        right--;
47                    }
48                }
49            }
50        }
51
52        return result;
53    }
54}