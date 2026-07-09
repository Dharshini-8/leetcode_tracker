// Last updated: 7/9/2026, 6:08:00 PM
1class Solution {
2    public boolean isPowerOfFour(int n) {
3      for(int i=0;i<=31;i++){
4        if(Math.pow(4,i)==n){
5            return true;
6        }
7      }   
8      return false;
9    }
10}