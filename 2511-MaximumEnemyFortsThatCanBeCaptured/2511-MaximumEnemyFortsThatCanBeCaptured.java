// Last updated: 9/12/2026, 2:15:38 PM
class Solution {
    public int captureForts(int[] forts) {
        int ans = 0;

        for (int i = 0; i < forts.length; i++) {

            if (forts[i] == 1) {

            
                int j = i + 1;

                while (j < forts.length && forts[j] == 0) {
                    j++;
                }

                if (j < forts.length && forts[j] == -1) {
                    ans = Math.max(ans, j - i - 1);
                }

            
                j = i - 1;

                while (j >= 0 && forts[j] == 0) {
                    j--;
                }

                if (j >= 0 && forts[j] == -1) {
                    ans = Math.max(ans, i - j - 1);
                }
            }
        }

        return ans;
    }
}