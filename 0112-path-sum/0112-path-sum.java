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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        int val = backtrack(root,targetSum);
        if(val == -1){
            return false;
        }
        return true;
    }
    private int backtrack(TreeNode root, int tar){
        if (root == null) {
            return -1;
        }
        
        if (root.left == null && root.right == null) {
            if (tar == root.val) {
                return 1;
            } else {
                return -1;
            }
        }
        int lef = backtrack(root.left,tar-root.val);
        int rt = backtrack(root.right,tar-root.val);
        if(lef == 1||rt == 1){
            return 1;
        }
        return -1;
    }
}