// Last updated: 9/12/2026, 2:16:41 PM
class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int a[]=new int[2*n];
        for(int i=0;i<n;i++){
            a[i]=nums[i];
            a[i+n]=nums[i];
        }
        return a;
    }
}