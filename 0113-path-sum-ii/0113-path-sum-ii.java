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
    List<List<Integer>> result = new ArrayList<>();
    
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if(root == null) return result;

        helper(root,targetSum,new ArrayList<>());
        return result;
    }

    public void helper(TreeNode root, int target,List<Integer> current) {
        if(root == null) return;

        current.add(root.val);
        if(root.left == null && root.right == null && target == root.val) {
            result.add(new ArrayList<>(current));
        }

        helper(root.left,target-root.val,current);
        helper(root.right,target-root.val,current);

        current.remove(current.size()-1);
    }
}