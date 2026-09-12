// Last updated: 9/12/2026, 2:15:07 PM
class Solution {
    public boolean uniformArray(int[] nums1) {
        boolean odd = false;
        boolean even = false;

        for (int num : nums1) {
            if (num % 2 == 0)
                even = true;
            else
                odd = true;
        }

        return true;
    }
}