/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> op=new ArrayList<>();
        helper(root,op);
        return op;
    }
    public void helper(TreeNode node,List<Integer> op)
    {
        if(node==null){
            return;
        }
        helper(node.left,op);
        helper(node.right,op);
        op.add(node.val);
    }
}