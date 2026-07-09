// Last updated: 7/9/2026, 9:27:24 AM
class Solution {
    public int hIndex(int[] c) {
        //test
        int n=c.length;
        Arrays.sort(c);
        for(int i=0;i<n;i++){
            int h=n-i;
            if(c[i]>=h){
                return h;
            }
        }
        return 0;
    }
}