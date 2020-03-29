/*
Given a sorted (increasing order) array, Convert it to create a binary search tree with minimal height.

Example
Example 1:

Input: []
Output:  {}
Explanation: The binary search tree is null
Example 2:

Input: [1,2,3,4,5,6,7]
Output:  {4,2,6,1,3,5,7}
Explanation:
A binary search tree with minimal height.

         4
       /   \
      2     6
     / \    / \
    1   3  5   7

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
    /*
     * @param A: an integer array
     * @return: A tree node
     */
    public TreeNode sortedArrayToBST(int[] A) {
        // write your code here
        int len = A.length;
        TreeNode result;
        if (len==0){
            return null;
        }
        
        int mid = len%2==0 ? len/2-1 :len/2;
        result = new TreeNode(A[mid]);
        int[] leftArray = Arrays.copyOfRange(A, 0, mid);
        int[] rightArray = Arrays.copyOfRange(A, mid+1, len);
        result.left = sortedArrayToBST(leftArray);
        result.right = sortedArrayToBST(rightArray);
        return result;

        
    }
}