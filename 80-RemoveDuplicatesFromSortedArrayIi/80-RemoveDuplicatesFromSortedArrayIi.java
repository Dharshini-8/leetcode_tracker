// Last updated: 7/9/2026, 9:28:21 AM
class Solution {
    public int removeDuplicates(int[] nums) {
        //test
        int k = 0;

        for(int i = 0; i < nums.length; i++) {
            int count = 0;

            for(int j = 0; j <= k - 1; j++) {
                if(nums[j] == nums[i]) {
                    count++;
                }
            }

            if(count < 2) {
                nums[k++] = nums[i];
            }
        }

        return k;
    }
}