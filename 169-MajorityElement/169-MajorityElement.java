// Last updated: 7/9/2026, 9:27:46 AM
class Solution {
    public int majorityElement(int[] nums) {
     
      Arrays.sort(nums);
      
      return nums[nums.length/2];
    }
}