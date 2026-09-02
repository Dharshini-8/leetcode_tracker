// Last updated: 9/2/2026, 9:49:52 AM
1class Solution {
2    public ListNode mergeKLists(ListNode[] lists) {
3
4        PriorityQueue<ListNode> pq = new PriorityQueue<>(
5            (a, b) -> a.val - b.val
6        );
7        for (ListNode node : lists) {
8            if (node != null) {
9                pq.add(node);
10            }
11        }
12
13        ListNode dummy = new ListNode(0);
14        ListNode current = dummy;
15
16        while (!pq.isEmpty()) {
17
18            ListNode node = pq.poll();
19
20            current.next = node;
21            current = current.next;
22
23            if (node.next != null) {
24                pq.add(node.next);
25            }
26        }
27
28        return dummy.next;
29    }
30}