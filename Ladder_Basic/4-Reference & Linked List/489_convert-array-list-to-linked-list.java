/*
Convert an array list to a linked list.
*/

/**
 * Definition for ListNode.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int val) {
 *         this.val = val;
 *         this.next = null;
 *     }
 * }
 */


public class Solution {
    /*
     * @param nums: an integer array
     * @return: the first node of linked list
     */
    public ListNode toLinkedList(List<Integer> nums) {
        // write your code here
        ListNode dummy = new ListNode(0);
        ListNode head = dummy;
        for (Integer num: nums) {
            ListNode cur = new ListNode(num);
            head.next = cur;
            head = cur;
        }
        return dummy.next;
    }
}