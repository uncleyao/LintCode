/*
Write code to remove duplicates from an unsorted linked list.

Example
Example 1:

Input: 1->2->1->3->3->5->6->3->null
Output: 1->2->3->5->6->null
Example 2:

Input: 2->2->2->2->2->null
Output: 2->null
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
     * @return: Head node.
     */
    public ListNode removeDuplicates(ListNode head) {
        // write your code here
        Set<Integer> dupset = new HashSet<Integer>();
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        head = dummy;
        while (head.next!=null) {
            if (dupset.contains(head.next.val)) {
                head.next = head.next.next;
            }
            else {
                dupset.add(head.next.val);
                head = head.next;
            }
        }
        return dummy.next;
    }
}