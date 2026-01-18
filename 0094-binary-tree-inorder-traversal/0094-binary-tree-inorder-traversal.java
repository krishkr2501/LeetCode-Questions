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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ls = new ArrayList<>();
        inOrder(root,ls);
        
        return ls;
    }
    static void inOrder(TreeNode root, List<Integer> res){
        int val1 = -1;
        if(root != null){
            inOrder(root.left, res);
            res.add(root.val);
            inOrder(root.right,res);
        }
        else{
            return;
        }
    }
}