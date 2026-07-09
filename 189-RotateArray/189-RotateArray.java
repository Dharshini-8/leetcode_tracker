// Last updated: 7/9/2026, 9:27:42 AM

class Solution {
    
    public void rotate(int[] nums, int k) {
         //retry sync
        int n = nums.length;
        int[] result = new int[n];

        k = k % n;

        for (int i = 0; i < n; i++) {
            result[(i + k) % n] = nums[i];
        }

        for (int i = 0; i < n; i++) {
            nums[i] = result[i];
        }
    }
}