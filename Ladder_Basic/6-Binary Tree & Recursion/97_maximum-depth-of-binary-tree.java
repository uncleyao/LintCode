/*
Given a binary tree, find its maximum depth.

The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

Example
Example 1:

Input: tree = {}
Output: 0
Explanation: The height of empty tree is 0.
Example 2:

Input: tree = {1,2,3,#,#,4,5}
Output: 3	
Explanation: Like this:
   1
  / \                
 2   3                
    / \                
   4   5
it will be serialized {1,2,3,#,#,4,5}
Notice
The answer will not exceed 5000

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