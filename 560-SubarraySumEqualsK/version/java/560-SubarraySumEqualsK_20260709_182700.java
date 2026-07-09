// Last updated: 7/9/2026, 6:27:00 PM
1class Solution {
2    public int subarraySum(int[] nums, int k) {
3
4        HashMap<Integer, Integer> map = new HashMap<>();
5        map.put(0, 1);
6
7        int sum = 0;
8        int count = 0;
9
10        for (int num : nums) {
11            sum += num;
12
13            if (map.containsKey(sum - k)) {
14                count += map.get(sum - k);
15            }
16
17            map.put(sum, map.getOrDefault(sum, 0) + 1);
18        }
19
20        return count;
21    }
22}