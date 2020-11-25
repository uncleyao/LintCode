/*
反转链表m和n
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