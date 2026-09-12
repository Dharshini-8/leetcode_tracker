// Last updated: 9/12/2026, 2:15:40 PM
import java.util.*;

class Solution {
    public int similarPairs(String[] words) {
        int count = 0;

        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {

                HashSet<Character> a = new HashSet<>();
                HashSet<Character> b = new HashSet<>();

                for (char c : words[i].toCharArray())
                    a.add(c);

                for (char c : words[j].toCharArray())
                    b.add(c);

                if (a.equals(b))
                    count++;
            }
        }

        return count;
    }
}