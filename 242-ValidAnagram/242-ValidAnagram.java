// Last updated: 7/9/2026, 9:27:29 AM
import java.util.Arrays;
//test
class Solution {
    public boolean isAnagram(String s, String t) {

        char[] a = s.toCharArray();
        char[] b = t.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b);
    }
}