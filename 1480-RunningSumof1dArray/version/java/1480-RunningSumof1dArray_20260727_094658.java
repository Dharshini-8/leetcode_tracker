// Last updated: 7/27/2026, 9:46:58 AM
1class Solution {
2    public int[] runningSum(int[] nums) {
3        for(int i=1;i<nums.length;i++){
4            nums[i]=nums[i]+nums[i-1];
5        
6    }
7    return nums;
8}
9}