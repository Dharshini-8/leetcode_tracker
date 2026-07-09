// Last updated: 7/9/2026, 9:27:26 AM
class Solution{
    public boolean isUgly (int n ){
        if(n<=0) return false;
        int [] factors={2,3,5};
        for(int factor : factors){
              while(n % factor == 0){
                n/=factor;
              }
        }
        return n==1;
    }
}