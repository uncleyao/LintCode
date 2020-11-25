

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