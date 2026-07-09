// Last updated: 09/07/2026, 22:14:32
1
2class Solution {
3    List<Integer> li=new ArrayList<>();
4    void preOrder(TreeNode root){
5        if(root!=null){
6            li.add(root.val);
7            preOrder(root.left);
8            preOrder(root.right);
9        }
10    }
11    public List<Integer> preorderTraversal(TreeNode root) {
12        preOrder(root);
13        return li;
14     
15    }
16}