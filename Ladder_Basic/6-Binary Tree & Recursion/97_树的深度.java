/*
Given a binary tree, find its maximum depth.

The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
获得树的深度

*/


/**
 * Definition of TreeNode:
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left, right;
 *     public TreeNode(int val) {
 *         this.val = val;
 *         this.left = this.right = null;
 *     }
 * }
 */

public class Solution {
    /**
     * @param root: The root of binary tree.
     * @return: An integer
     */
    private int height =0;
    public int maxDepth(TreeNode root) {
        // write your code here
        traverse(root,1);
        return height;
        
    }
    
    private void traverse(TreeNode root, int depth) {
        if (root==null){
            return;
        }
        height = Math.max(depth,height);
        traverse(root.left, depth+1);
        traverse(root.right,depth+1);
    }
}

public class Solution2 {
    
   
    public int TreeDepth(TreeNode root) {
        if (root==null){
            return 0;
        }
        int left = TreeDepth(root.left);
        int right = TreeDepth(root.right);
        return Math.max(left,right)+1;
    }
}