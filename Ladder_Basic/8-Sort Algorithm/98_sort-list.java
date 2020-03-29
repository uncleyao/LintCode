/*
Sort a linked list in O(n log n) time using constant space complexity.

Example
Example 1:

Input:  1->3->2->null
Output:  1->2->3->null
Example 2:

Input: 1->7->2->6->null
Output: 1->2->6->7->null

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
     * @param head: The head of linked list.
     * @return: You should return the head of the sorted linked list, using constant space complexity.
     */
    public ListNode sortList(ListNode head) {
        // write your code here
        if (head==null || head.next==null) {
            return head;
        }
        ListNode mid = findMid(head);
        ListNode right = sortList(mid.next);
        mid.next = null;
        ListNode left = sortList(head);
        return mergeTwoLists(left, right);
        
        
    }
    
    private ListNode findMid(ListNode head) {
        ListNode slow = head, fast = head.next;
        while (fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    
    
    
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(-1);
        ListNode temp = result;
        while (l1!=null && l2!=null) {
            if (l1.val<l2.val) {
                temp.next = l1;
                l1 = l1.next;
            }
            else {
                temp.next = l2;
                l2 = l2.next;
            }
            temp = temp.next;
        }
        if (l1==null) {temp.next = l2;}
        else if (l2==null) {temp.next = l1;}
        return result.next;
        
    }
}