/*
Reverse a linked list from position m to n.

Example
Example 1:

Input: 1->2->3->4->5->NULL, m = 2 and n = 4, 
Output: 1->4->3->2->5->NULL.
Example 2:

Input: 1->2->3->4->NULL, m = 2 and n = 3, 
Output: 1->3->2->4->NULL.
Challenge
Reverse it in-place and in one-pass

Notice
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
     * @param head: ListNode head is the head of the linked list 
     * @param m: An integer
     * @param n: An integer
     * @return: The head of the reversed ListNode
     */
    public ListNode reverseBetween(ListNode head, int m, int n) {
        // write your code here
        if (m>=n) {return head;}
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        for (int i=1;i<m;i++) {
            if (pre==null) {
                return null;
            }
            pre = pre.next;
        }
        ListNode mNode = pre.next;
        ListNode nNode = pre.next;
        ListNode tail = mNode.next;
        for (int i=m;i<n;i++) {
            if (nNode==null) {
                return null;
            }
            ListNode temp = tail.next;
            tail.next = nNode;
            nNode = tail;
            tail = temp;
        }
        mNode.next = tail;
        pre.next = nNode;
        return dummy.next;
    }
}