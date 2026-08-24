// Last updated: 8/24/2026, 9:25:34 AM
1class Solution {
2    public void sortColors(int[] nums) {
3        int count0 = 0;
4        int count1 = 0;
5        int count2 = 0;
6
7        for (int x : nums) {
8            if (x == 0)
9                count0++;
10            else if (x == 1)
11                count1++;
12            else
13                count2++;
14        }
15
16        int i = 0;
17
18        while (count0-- > 0)
19            nums[i++] = 0;
20
21        while (count1-- > 0)
22            nums[i++] = 1;
23
24        while (count2-- > 0)
25            nums[i++] = 2;
26    }
27}