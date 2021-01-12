class Solution:
    """
    @param l1: the first list
    @param l2: the second list
    @return: the sum list of l1 and l2 
    """
    def addLists(self, l1, l2):
        # write your code here
        dummy = cur = ListNode(0)
        carry = 0
        while l1 or l2 or carry:
            if l1:
                carry+=l1.val 
                l1 = l1.next
            if l2:
                carry+=l2.val 
                l2 = l2.next
            cur.next = ListNode(carry%10)
            cur = cur.next
            carry//=10
        return dummy.next