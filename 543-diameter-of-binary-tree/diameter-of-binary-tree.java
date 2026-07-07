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
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null){
            return 0;
        }
        
        int leftDiameter = diameterOfBinaryTree(root.left);
        int leftHeight = Height(root.left);

        int rightDiameter = diameterOfBinaryTree(root.right);
        int rightHeight = Height(root.right);

        int selfDiameter = leftHeight + rightHeight;
        int res = Math.max(leftDiameter,Math.max(rightDiameter, selfDiameter));
        return res ;
        
    }

    private int Height(TreeNode root){
        if(root == null){
            return 0;
        }

        int left = Height(root.left);
        int right = Height(root.right);
        int height = Math.max(left, right) + 1;
        return height;
    }
}