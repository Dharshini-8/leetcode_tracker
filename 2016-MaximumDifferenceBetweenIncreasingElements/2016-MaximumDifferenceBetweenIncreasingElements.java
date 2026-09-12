// Last updated: 9/12/2026, 2:16:35 PM
class Solution {
    public int maximumDifference(int[] nums) {

        int min = nums[0];
        int maxDiff = -1;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] > min) {
                maxDiff = Math.max(maxDiff, nums[i] - min);
            } else {
                min = nums[i];
            }
        }

        return maxDiff;
    }
}