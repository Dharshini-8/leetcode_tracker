// Last updated: 7/14/2026, 11:45:31 AM
1class Solution {
2    public int[] getConcatenation(int[] nums) {
3        int n=nums.length;
4        int a[]=new int[2*n];
5        for(int i=0;i<n;i++){
6            a[i]=nums[i];
7            a[i+n]=nums[i];
8        }
9        return a;
10    }
11}