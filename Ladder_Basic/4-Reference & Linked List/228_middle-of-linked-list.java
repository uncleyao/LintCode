/*
Find the middle node of a linked list.
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
     * @return: a middle node of the linked list
     */
    public ListNode middleNode(ListNode head) {
        // write your code here
        ListNode headmid = head;
        while (head!=null && head.next!=null && head.next.next!=null) {
            headmid = headmid.next;
            head = head.next.next;
        }
        return headmid;
    }
}