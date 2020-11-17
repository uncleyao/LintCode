public class Solution {

    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        ListNode slow = pHead;
        ListNode fast = pHead;
        while (slow!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast){
                break;
            }
        }
        if (slow==null || fast.next==null){
            return null;
        }
        /**
        * 起点距离x，slow到入口距离y
        * x+y = slowlength
        * slowlength + nr = 2*slowlength
        * => x = nr-y => 如果head移动到入口，slow移动了nr-y，加上slow之前的y正好一轮
        */
        ListNode headWalk = pHead;
        while (headWalk!=slow){
            headWalk = headWalk.next;
            slow = slow.next;
        }
        return headWalk;
        
    }
}