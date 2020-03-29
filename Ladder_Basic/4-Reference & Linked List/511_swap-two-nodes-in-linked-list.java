/*
Given a linked list and two values v1 and v2. Swap the two nodes in the linked list with values v1 and v2. It's guaranteed there is no duplicate values in the linked list. If v1 or v2 does not exist in the given linked list, do nothing.

Example
Example 1:

Input: 1->2->3->4->null, v1 = 2, v2 = 4
Output: 1->4->3->2->null
Example 2:

Input: 1->null, v1 = 2, v2 = 1
Output: 1->null
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
     * @param v1: An integer
     * @param v2: An integer
     * @return: a new head of singly-linked list
     */
    public ListNode swapNodes(ListNode head, int v1, int v2) {
        // write your code here
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode cur = dummy;
        ListNode node1 = null;
        ListNode node2 = null;
        ListNode pre1 = null;
        ListNode pre2 = null;
        ListNode tail2 = null;
        while (cur.next!=null) {
            if (cur.next.val == v1) {
                pre1 = cur;
            }
            else if (cur.next.val == v2) {
                pre2 = cur;
            }
          
            cur = cur.next;
        }
        if (pre1==null || pre2 ==null) {
            return  head;
        }
        
        if (pre1 == pre2.next) {
            ListNode temp = pre1;
            pre1 = pre2;
            pre2 = temp;
        }
        
        node1 = pre1.next;
        node2 = pre2.next;
        tail2 = node2.next;
        
        if (pre1.next == pre2) {
            pre1.next = node2;
            node2.next = node1;
            node1.next = tail2;
        }
        else {
            pre1.next = node2;
            node2.next = node1.next;
            pre2.next = node1;
            node1.next = tail2;
        }
        
        return dummy.next;



        
    }
}