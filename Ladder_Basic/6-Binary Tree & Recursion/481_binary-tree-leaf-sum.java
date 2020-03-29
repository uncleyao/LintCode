/*
Given a binary tree, calculate the sum of leaves.

Example
Example 1:

Input：{1,2,3,4}
Output：7
Explanation：
    1
   / \
  2   3
 /
4
3+4=7
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
     * @param root: the root of the binary tree
     * @return: An integer
     */
    private int sum=0;
    public int leafSum(TreeNode root) {
        // write your code here
        traverse(root);
        return sum;
        
    }
    
    private void traverse(TreeNode root) {
        if (root==null){
            return;
        }
        
        if (root.left==null && root.right == null){
            sum+=root.val;
        }
        traverse(root.left);
        traverse(root.right);
        
    }
}