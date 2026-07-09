// Last updated: 7/9/2026, 9:28:01 AM
class Solution {
    public int singleNumber(int[] nums) {
        int x=0;
        for(int num:nums)
            x^=num;
        return x;
    }
}