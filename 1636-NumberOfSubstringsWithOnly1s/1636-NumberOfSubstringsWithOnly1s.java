// Last updated: 7/9/2026, 9:26:20 AM
class Solution {
    //test
    public int numSub(String s) {
        long c=0;
        long r=0;
        long mod=1000000007;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                c++;
                r=(r+c)%mod;
            }
            else{
                c=0;
            }
            
        }
        return (int) r;
    }
}