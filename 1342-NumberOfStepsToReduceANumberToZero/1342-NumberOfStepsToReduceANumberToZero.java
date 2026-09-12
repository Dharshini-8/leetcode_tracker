// Last updated: 9/12/2026, 2:17:49 PM
class Solution {
    public int numberOfSteps(int num) {
        int count = 0;

        while (num > 0) {
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = num - 1;
            }
            count++;
        }

        return count;
    }
}