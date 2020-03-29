/*
Convert a linked list to an array list.

Example
Example 1:

Input: 1->2->3->null
Output: [1,2,3]
Example 2:

Input: 3->5->8->null
Output: [3,5,8]
*/

/**
 * Definition for ListNode
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class Solution {
    /**
     * @param head: the head of linked list.
     * @return: An integer list
     */
    public List<Integer> toArrayList(ListNode head) {
        // write your code here
        ArrayList<Integer> result = new ArrayList<Integer>();
        while (head != null) {
            result.add(head.val);
            head = head.next;
        }
        return result;
    }
}