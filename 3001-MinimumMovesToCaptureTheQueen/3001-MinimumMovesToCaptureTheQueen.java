// Last updated: 9/12/2026, 2:15:06 PM
class Solution {
    public int minMovesToCaptureTheQueen(int a, int b, int c, int d, int e, int f) {

        if (a == e) {
            if (!(c == a && d > Math.min(b, f) && d < Math.max(b, f))) {
                return 1;
            }
        }
        if (b == f) {
            if (!(d == b && c > Math.min(a, e) && c < Math.max(a, e))) {
                return 1;
            }
        }

        if (Math.abs(c - e) == Math.abs(d - f)) {

        
            if (!(Math.abs(c - a) == Math.abs(d - b) &&
                  Math.abs(a - e) == Math.abs(b - f) &&
                  Math.min(c, e) < a && a < Math.max(c, e))) {
                return 1;
            }
        }

        return 2;
    }
}