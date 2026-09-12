// Last updated: 9/12/2026, 2:17:36 PM
class Solution {
    public int[] runningSum(int[] nums) {
        for(int i=1;i<nums.length;i++){
            nums[i]=nums[i]+nums[i-1];
        
    }
    return nums;
}
}