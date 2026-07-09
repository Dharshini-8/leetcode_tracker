// Last updated: 7/9/2026, 9:27:00 AM
import java.util.*;

class Solution {
    public int longestPalindrome(String s) {
         //test
        HashMap<Character, Integer> map = new HashMap<>();

        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        int len = 0;
        boolean odd = false;

    
        for (Integer count : map.values()) {

            if (count % 2 == 0) {
                len += count;
            } else {
                len += count - 1;
                odd = true;
            }
        }

        if (odd) {
            len++;
        }

        return len;
    }
}