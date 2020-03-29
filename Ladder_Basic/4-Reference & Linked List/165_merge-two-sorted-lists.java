/*
Merge two sorted (ascending) linked lists and return it as a new sorted list. The new sorted list should be made by splicing together the nodes of the two lists and sorted in ascending order.
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
     * @param l1: ListNode l1 is the head of the linked list
     * @param l2: ListNode l2 is the head of the linked list
     * @return: ListNode head of linked list
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // write your code here
        ListNode prev1 = l1;
        ListNode prev2 = l2;
        ListNode result = new ListNode(-1);
        ListNode temp = result;
        while (prev1!=null && prev2!=null)
        {
            if (prev1.val < prev2.val){
                // ListNode temp = result;
                temp.next = prev1;
                prev1 = prev1.next;
            }
            else if (prev1.val >= prev2.val){
                temp.next = prev2;
                prev2 = prev2.next;
                
            }
            temp = temp.next;
        }
        if (prev1 == null){
            temp.next = prev2;
        }
        else if (prev2 == null){
            temp.next = prev1;
        }
        return result.next;
    }
}