// Last updated: 7/9/2026, 9:29:32 AM
 
class Solution {
    public int[] twoSum(int[] nums, int target) {
       // retry sync
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(nums[i]+nums[j]==target)
                return new int[] {i,j};
            }
        }
    
    return new int[] {};
    }
}