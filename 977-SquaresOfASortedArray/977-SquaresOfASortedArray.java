// Last updated: 9/12/2026, 2:18:19 PM
class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i = 0;i<nums.length;i++)
        {
            nums[i] *= nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}