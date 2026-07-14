// Last updated: 7/14/2026, 11:41:47 AM
1class Solution {
2    public int[] shuffle(int[] nums, int n) {
3        int a[]= new int[2*n];
4        int j=0;
5        for(int i=0;i<n;i++){
6            a[j++]=nums[i];
7            a[j++]=nums[i+n];
8        }
9        return a;
10    }
11}