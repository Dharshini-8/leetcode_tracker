// Last updated: 8/3/2026, 5:33:31 PM
1class Solution {
2    public ListNode deleteMiddle(ListNode head) {
3
4        if (head == null || head.next == null)
5            return null;
6
7        ListNode slow = head;
8        ListNode fast = head;
9        ListNode prev = null;
10
11        while (fast != null && fast.next != null) {
12            prev = slow;
13            slow = slow.next;
14            fast = fast.next.next;
15        }
16
17        prev.next = slow.next;
18
19        return head;
20    }
21}