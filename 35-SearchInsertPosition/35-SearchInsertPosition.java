// Last updated: 7/9/2026, 9:28:56 AM
class Solution {
    //test
    public int searchInsert(int[] nums, int target) {
        
         
        for(int i=0;i<nums.length;i++){
           
            if(nums[i]>=target)
               return i;
        }
       
        return nums.length;
    }
}