// Last updated: 7/9/2026, 9:27:58 AM
import java.util.*;

class Solution {
    public int maxPoints(int[][] points) {
        if (points.length <= 2) return points.length;

        int result = 0;

        for (int i = 0; i < points.length; i++) {
            Map<String, Integer> map = new HashMap<>();
            int duplicates = 0, max = 0;

            for (int j = i + 1; j < points.length; j++) {
                int dx = points[j][0] - points[i][0];
                int dy = points[j][1] - points[i][1];

                if (dx == 0 && dy == 0) {
                    duplicates++;
                    continue;
                }

                // find gcd manually (no function call)
                int a = dx, b = dy;
                while (b != 0) {
                    int temp = b;
                    b = a % b;
                    a = temp;
                }
                int gcd = Math.abs(a);

                dx /= gcd;
                dy /= gcd;

                // normalize slope
                if (dx < 0) {
                    dx = -dx;
                    dy = -dy;
                } else if (dx == 0) {
                    dy = 1; // vertical line
                } else if (dy == 0) {
                    dx = 1; // horizontal line
                }

                String slope = dx + "/" + dy;
                map.put(slope, map.getOrDefault(slope, 0) + 1);
                max = Math.max(max, map.get(slope));
            }
            result = Math.max(result, max + duplicates + 1);
        }
        return result;
    }
}
