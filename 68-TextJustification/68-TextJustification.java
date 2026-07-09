// Last updated: 7/9/2026, 9:28:28 AM
import java.util.*;

class Solution {
    //retry sync
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        int i = 0;

        while (i < words.length) {
            int j = i;
            int lineLength = 0;

            
            while (j < words.length &&
                   lineLength + words[j].length() + (j - i) <= maxWidth) {
                lineLength += words[j].length();
                j++;
            }

            int numWords = j - i;
            int spaces = maxWidth - lineLength;

            StringBuilder line = new StringBuilder();

            
            if (j == words.length || numWords == 1) {
                for (int k = i; k < j; k++) {
                    line.append(words[k]);

                    if (k < j - 1)
                        line.append(" ");
                }

                while (line.length() < maxWidth) {
                    line.append(" ");
                }
            }
            else {
                int gaps = numWords - 1;

                int evenSpaces = spaces / gaps;
                int extraSpaces = spaces % gaps;

                for (int k = i; k < j; k++) {
                    line.append(words[k]);

                    if (k < j - 1) {
                        for (int s = 0; s < evenSpaces; s++)
                            line.append(" ");

                        if (extraSpaces > 0) {
                            line.append(" ");
                            extraSpaces--;
                        }
                    }
                }
            }

            result.add(line.toString());
            i = j;
        }

        return result;
    }
}