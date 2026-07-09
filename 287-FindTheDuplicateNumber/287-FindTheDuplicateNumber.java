// Last updated: 7/9/2026, 9:27:18 AM
class Solution {
    //test
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
                if(nums[i]==nums[i+1]){
                     return nums[i];
                }
        }
        return -1;
    }
}