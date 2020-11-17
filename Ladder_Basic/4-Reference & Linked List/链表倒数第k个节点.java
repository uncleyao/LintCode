public class Solution {
    public ListNode FindKthToTail(ListNode head,int k) {
        if (head==null || k<=0){
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (k>1){
            if(fast.next!=null){
                fast = fast.next;
                k--;
            } else {
                return null;
            }
        }
        while (fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}