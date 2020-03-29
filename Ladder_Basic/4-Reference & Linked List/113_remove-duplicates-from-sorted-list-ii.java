/*
Given a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list.

Example
Example 1

Input : 1->2->3->3->4->4->5->null
Output : 1->2->5->null
Example 2

Input : 1->1->1->2->3->null
Output : 2->3->null
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
     * @param head: head is the head of the linked list
     * @return: head of the linked list
     */
    public ListNode deleteDuplicates(ListNode head) {
        // write your code here
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        while (pre.next!=null && pre.next.next!=null) {
            if (pre.next.val == pre.next.next.val) {
                int val = pre.next.val;
                while (pre.next!=null && pre.next.val ==val) {
                    pre.next = pre.next.next;
                }
            }
            else {
                pre = pre.next;
            }
            
        }
        return dummy.next;
    }
}