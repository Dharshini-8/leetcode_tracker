// Last updated: 9/12/2026, 2:18:40 PM
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
