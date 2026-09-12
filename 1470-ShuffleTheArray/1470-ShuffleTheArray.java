// Last updated: 9/12/2026, 2:17:41 PM
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int a[]= new int[2*n];
        int j=0;
        for(int i=0;i<n;i++){
            a[j++]=nums[i];
            a[j++]=nums[i+n];
        }
        return a;
    }
}