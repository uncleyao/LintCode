/*
Given a sorted linked list, delete all duplicates such that each element appear only once.

Example
Example 1:
    Input:  null
    Output: null


Example 2:
    Input:  1->1->2->null
    Output: 1->2->null
    
Example 3:
    Input:  1->1->2->3->3->null
    Output: 1->2->3->null
    
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
     * @return: head of linked list
     */
    public ListNode deleteDuplicates(ListNode head) {
        // write your code here
        ListNode cur = head;
        while (cur!=null && cur.next !=null) {
            ListNode temp = cur.next;
            while (temp!=null && cur.val== temp.val) {
                temp = temp.next;
            }
            cur.next = temp;
            cur = cur.next;
            
        }
        return head;
    }
}