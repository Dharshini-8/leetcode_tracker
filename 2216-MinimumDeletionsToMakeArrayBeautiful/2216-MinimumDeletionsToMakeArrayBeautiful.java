// Last updated: 9/12/2026, 2:17:57 PM
class Solution {
    public int minDeletion(int[] nums) {

        int delete = 0;
        int size = 0;

        for (int i = 0; i < nums.length; i++) {

            if (size % 2 == 0) {

                if (i + 1 < nums.length && nums[i] == nums[i + 1]) {
                    delete++;
                } else {
                    size++;
                }

            } else {
                size++;
            }
        }

        if (size % 2 == 1) {
            delete++;
        }

        return delete;
    }
}