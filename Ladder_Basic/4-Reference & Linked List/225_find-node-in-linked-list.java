/*
Find a node with given value in a linked list. Return null if not exists.

Example
Example 1:

Input:  1->2->3 and value = 3
Output: The last node.
Example 2:

Input:  1->2->3 and value = 4
Output: null
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
    /*
     * @param head: the head of linked list.
     * @param val: An integer.
     * @return: a linked node or null.
     */
    public ListNode findNode(ListNode head, int val) {
        // write your code here
        while (head!=null) {
            if (head.val==val) {
                return head;
            }
            head = head.next;
        }
        return head;
    }
}