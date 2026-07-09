// Last updated: 7/9/2026, 9:28:45 AM
//retry sync
class Solution {
    
    public boolean canJump(int[] nums) {
           
        int maxReach = 0;

        for (int i = 0; i < nums.length; i++) {

            if (i > maxReach) {
                return false;
            }

            maxReach = Math.max(maxReach, i + nums[i]);
        }

        return true;
    }
}