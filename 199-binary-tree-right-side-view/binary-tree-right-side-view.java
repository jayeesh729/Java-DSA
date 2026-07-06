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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        int level = 0;
        reversePreorder(root, level, res);
        return res;
    }
    private void reversePreorder(TreeNode root, int level, List<Integer> res){
        if(root == null){
            return;
        }
        if(level == res.size()){
            res.add(root.val);
        }
        reversePreorder(root.right, level+1 ,res);
        reversePreorder(root.left, level+1 , res);
    }
}