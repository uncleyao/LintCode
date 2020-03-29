/*
Implement a function to check if a linked list is a palindrome.

Example
Example 1:

Input: 1->2->1
output: true
Example 2:

Input: 2->2->1
output: false
Challenge
Could you do it in O(n) time and O(1) space?
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
     * @param head: A ListNode.
     * @return: A boolean.
     */
    public boolean isPalindrome(ListNode head) {
        // write your code here
        ArrayList<Integer> lists = new ArrayList<Integer>();
        while (head!=null) {
            lists.add(head.val);
            head = head.next;
        }
        for (int i = 0; i < lists.size();i++) {
            
            if (Integer.compare(lists.get(i) , lists.get(lists.size()-i-1)) !=0) {
                return false;
            }
        }
        return true;
    }
}