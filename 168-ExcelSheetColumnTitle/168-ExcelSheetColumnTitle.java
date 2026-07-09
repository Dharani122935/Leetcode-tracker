// Last updated: 09/07/2026, 22:15:41
1
2class Solution {
3    public List<Integer> inorderTraversal(TreeNode root) {
4        List<Integer> list = new ArrayList<>();
5        if(root != null){
6            list.addAll(inorderTraversal(root.left));
7            list.add(root.val);
8            list.addAll(inorderTraversal(root.right));
9            }
10            return list;
11    }
12}