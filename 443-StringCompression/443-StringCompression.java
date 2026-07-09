// Last updated: 7/9/2026, 9:26:54 AM
class Solution {
    //test
    public int compress(char[] chars) {
        int i = 0;
        int index = 0;

        while (i < chars.length) {
            char ch = chars[i];
            int count = 0;

            while (i < chars.length && chars[i] == ch) {
                count++;
                i++;
            }

            chars[index++] = ch;

            if (count > 1) {
                String s = String.valueOf(count);
                for (int j = 0; j < s.length(); j++) {
                    chars[index++] = s.charAt(j);
                }
            }
        }

        return index;
    }
}
