// Last updated: 13/07/2026, 10:12:16

class Solution {
    List<Integer> li=new ArrayList<>();
    void preOrder(TreeNode root){
        if(root!=null){
            li.add(root.val);
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        preOrder(root);
        return li;
     
    }
}