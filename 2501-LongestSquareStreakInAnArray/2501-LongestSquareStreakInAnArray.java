// Last updated: 9/12/2026, 2:15:42 PM
import java.util.*;

class Solution {
    public int longestSquareStreak(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int n : nums) {
            set.add(n);
        }

        int ans = -1;

        for (int n : nums) {
            int count = 1;
            long x = n;

            while (x * x <= 100000) {
                x = x * x;

                if (set.contains((int)x)) {
                    count++;
                } else {
                    break;
                }
            }

            if (count >= 2) {
                ans = Math.max(ans, count);
            }
        }

        return ans;
    }
}