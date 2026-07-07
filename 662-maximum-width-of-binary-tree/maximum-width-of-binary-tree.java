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

class Pair{
    TreeNode node;
    int index;
    Pair(TreeNode _node, int _index){
        node = _node;
        index = _index;
    }
}
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        int ans = 0;
        if(root==null)return 0;
        Queue<Pair> q = new LinkedList<>();       
        q.offer(new Pair(root, 0));
        while(!q.isEmpty()){
            int size = q.size();
            int first = 0;
            int last = 0;
            int minIndex = q.peek().index;
            for(int i=0; i<size ;i++){
                int curr_index = q.peek().index - minIndex;
                TreeNode node = q.peek().node;
                q.poll();
                if(i==0)first = curr_index;
                if(i == size-1) last = curr_index;
                if( node.left != null) q.offer(new Pair(node.left , (2*curr_index)+1));
                if(node.right != null) q.offer(new Pair(node.right , (2*curr_index)+2));
            }
            ans = Math.max(ans ,first + last + 1);
        }
        return ans;
    }
}