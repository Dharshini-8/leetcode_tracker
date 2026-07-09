// Last updated: 7/9/2026, 9:26:45 AM
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        //test
        int count = 0;

        for (int i = 0; i < stones.length(); i++) {
            for (int j = 0; j < jewels.length(); j++) {
                if (stones.charAt(i) == jewels.charAt(j)) {
                    count++;
                }
            }
        }

        return count;
    }

    }
