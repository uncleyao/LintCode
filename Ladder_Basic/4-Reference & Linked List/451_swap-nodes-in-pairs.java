/*
Given a linked list, swap every two adjacent nodes and return its head.

Example
Example 1:

Input: 1->2->3->4->null
Output: 2->1->4->3->null
Example 2:

Input: 5->null
Output: 5->null
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
     * @param head: a ListNode
     * @return: a ListNode
     */
    public ListNode swapPairs(ListNode head) {
        // write your code here
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        while (pre!=null && pre.next!=null && pre.next.next!=null) {
            ListNode temp = head.next;
            pre.next = temp;
            head.next = temp.next;
            temp.next = head;
            pre = head;
            head = head.next;
            
        }
        
        return dummy.next;
    }
}