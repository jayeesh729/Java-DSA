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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(checkSubtree(root, subRoot)){
            return true;
        }
        return false;
        
    }

    private boolean isIdenticalSubTree(TreeNode root, TreeNode subRoot){
        if(root==null && subRoot==null){
            return true;
        }
        else if (root == null || subRoot == null || root.val != subRoot.val){
            return false;
        }

        if( !isIdenticalSubTree(root.left, subRoot.left)){
            return false;
        }
        if( !isIdenticalSubTree(root.right, subRoot.right)){
            return false;
        }

        return true;
    }

    private boolean checkSubtree(TreeNode root, TreeNode subRoot){
        if(root == null){
            return false;
        }
        if(root.val == subRoot.val){
            if(isIdenticalSubTree(root, subRoot)){
                return true;
            }
        }
        return checkSubtree(root.left, subRoot) || checkSubtree(root.right, subRoot);
    }
}