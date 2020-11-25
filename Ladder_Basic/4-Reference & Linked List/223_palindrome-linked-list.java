

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