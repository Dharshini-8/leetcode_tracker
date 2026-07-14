// Last updated: 7/14/2026, 10:11:02 AM
1class Solution {
2    public int countDaysTogether(String arriveAlice, String leaveAlice,
3                                 String arriveBob, String leaveBob) {
4
5        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
6
7        int a1 = convert(arriveAlice, days);
8        int a2 = convert(leaveAlice, days);
9        int b1 = convert(arriveBob, days);
10        int b2 = convert(leaveBob, days);
11
12        int start = Math.max(a1, b1);
13        int end = Math.min(a2, b2);
14
15        if (start > end)
16            return 0;
17
18        return end - start + 1;
19    }
20
21    public int convert(String date, int[] days) {
22        int month = Integer.parseInt(date.substring(0, 2));
23        int day = Integer.parseInt(date.substring(3));
24
25        int total = day;
26
27        for (int i = 0; i < month - 1; i++) {
28            total += days[i];
29        }
30
31        return total;
32    }
33}