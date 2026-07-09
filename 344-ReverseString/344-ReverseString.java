// Last updated: 7/9/2026, 9:27:12 AM
class Solution {
    public void reverseString(char[] s) {
        int b=s.length-1;
        for(int i=0;i<s.length/2;i++){
            char temp =s[i];
            s[i]=s[b];
            s[b]=temp;
            b--;
        }
    }
}