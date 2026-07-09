// Last updated: 7/9/2026, 9:26:42 AM
class Solution {
    public int search(int[] nums, int target) {
        
        int left = 0;
        int right = nums.length - 1;

        while(left <= right) {

            int mid = (left + right) / 2;

            if(nums[mid] == target) {
                return mid;
            }

            if(nums[mid] < target) {
                left = mid + 1;
            } 
            else {
                right = mid - 1;
            }
        }

        return -1;
    }
}