/*
Sort a linked list using insertion sort.

Example
Example 1:
    Input: 0->null
    Output: 0->null


Example 2:
    Input:  1->3->2->0->null
    Output :0->1->2->3->null
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
     * @param head: The first node of linked list.
     * @return: The head of linked list.
     */
    public ListNode insertionSortList(ListNode head) {
        // write your code here
        ListNode dummy = new ListNode(0);
        while (head!=null) {
            ListNode cur = dummy;
            while (cur.next!=null && cur.next.val < head.val) {
                cur =cur.next;
            }
            ListNode temp = head.next;
            head.next = cur.next;
            cur.next = head;
            head = temp;
        }
        return dummy.next;
    }
}