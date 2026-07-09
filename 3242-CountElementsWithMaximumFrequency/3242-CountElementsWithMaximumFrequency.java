// Last updated: 7/9/2026, 9:26:16 AM
class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer,Integer>map=new LinkedHashMap<>();
        for(int k:nums){
            map.put(k,map.getOrDefault(k,0)+1);
        }
        int max=0;
       for(int k:map.values()){
        max=Math.max(max,k);
       }
       int sum=0;
       for(int k:map.values()){
        if(k==max){
            sum+=max;
         }
       }
       return sum;
    }
}