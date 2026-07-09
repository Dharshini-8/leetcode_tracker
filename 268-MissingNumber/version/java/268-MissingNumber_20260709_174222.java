// Last updated: 7/9/2026, 5:42:22 PM
1class Solution {
2    public int missingNumber(int[] nums) {
3        int n=nums.length;
4        int sum=0;
5            int total=n*(n+1)/2;
6        for(int i=0;i<n;i++){
7            
8            sum+=nums[i];
9            
10        }
11        return total-sum;
12    }
13}