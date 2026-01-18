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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ls = new ArrayList<>();
        preOrder(root,ls);
        
        return ls;
    }
    static void preOrder(TreeNode root, List<Integer> res){
        int val1 = -1;
        if(root != null){
            res.add(root.val);
            preOrder(root.left, res);
            preOrder(root.right,res);
        }
        else{
            return;
        }
    }
}