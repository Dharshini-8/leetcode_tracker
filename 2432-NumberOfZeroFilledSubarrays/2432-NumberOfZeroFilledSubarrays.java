// Last updated: 7/9/2026, 9:26:09 AM
class Solution {
    public long zeroFilledSubarray(int[] nums) {
        //test
        long c=0;
        long r=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                c++;
                r+=c;
            }
            else{
                c=0;
            }
        }
        return r;
    }
}