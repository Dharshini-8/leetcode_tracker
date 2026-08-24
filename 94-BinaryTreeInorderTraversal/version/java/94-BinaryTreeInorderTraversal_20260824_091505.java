// Last updated: 8/24/2026, 9:15:05 AM
1class Solution {
2    public List<Integer> inorderTraversal(TreeNode root) {
3        List<Integer> result = new ArrayList<>();
4
5        inorder(root, result);
6
7        return result;
8    }
9
10    void inorder(TreeNode root, List<Integer> result) {
11        if (root == null) {
12            return;
13        }
14
15        inorder(root.left, result);
16        result.add(root.val);
17        inorder(root.right, result);
18    }
19}