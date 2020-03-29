/*
Given a binary tree and an integer which is the depth of the target level.

Calculate the sum of the nodes in the target level.

Example
Example 1:

Input：{1,2,3,4,5,6,7,#,#,8,#,#,#,#,9},2
Output：5 
Explanation：
     1
   /   \
  2     3
 / \   / \
4   5 6   7
   /       \
  8         9
2+3=5
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
     * @param level: the depth of the target level
     * @return: An integer
     */
    private int sum = 0;
    public int levelSum(TreeNode root, int level) {
        // write your code here
        traverse(root,level);
        return sum;
        
    }
    
    private void traverse(TreeNode root, int level) {
        if (root==null) {
            return;
        }
        if (level==1) {
            sum+=root.val;
            return;
        }
        traverse(root.left, level-1);
        traverse(root.right, level-1);
    }
}