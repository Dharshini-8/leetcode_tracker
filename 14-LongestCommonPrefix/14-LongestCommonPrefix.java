// Last updated: 7/9/2026, 9:29:09 AM
class Solution {
    public String longestCommonPrefix(String[] strs) {
        //test
        String prefix=strs[0];
        for(int i=0;i<strs.length;i++){
            while(strs[i].indexOf(prefix)!=0){
                prefix=prefix.substring(0,prefix.length()-1);
                if(prefix.length()==0){
        
                    return "";
                }
            }
        }
         return prefix;
    }
}