/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // traverse till p or q if null return root
        if(root==null || root == p || root == q){
            return root;
        }
        
        TreeNode left = lowestCommonAncestor(root.left, p,q);
        TreeNode right = lowestCommonAncestor(root.right, p ,q);

        if(left == null){
            return right;
        }
        if (right == null){
            return left;
        }
        // if both are null return root
        else{
            return root;
        }
    }
}