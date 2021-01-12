class Solution:
    """
    @param l1: The first list.
    @param l2: The second list.
    @return: the sum list of l1 and l2.
    """
    
    def reverse(self, l):
        pre = None
        cur = l
        nextl = cur.next
        while nextl:
            cur.next = pre
            pre = cur
            cur = nextl
            nextl = nextl.next
        cur.next = pre
        return cur
        
    def addLists2(self, l1, l2):
        # write your code here
        l1 = self.reverse(l1)
        l2 = self.reverse(l2)
        dummy = ListNode(0)
        cur = dummy
        # pre用于最后删去最高位为0的结点
        pre = None
        while l1 and l2:
            sum = cur.val + l1.val + l2.val
            cur.val = sum%10
            cur.next = ListNode(sum//10)
            l1 = l1.next
            l2 = l2.next
            pre = cur
            cur = cur.next
        while l1:
            sum = cur.val+l1.val
            cur.val = sum%10
            cur.next = ListNode(sum//10)
            l1 = l1.next
            pre = cur
            cur = cur.next
        while l2:
            sum = cur.val+l2.val
            cur.val = sum%10
            cur.next = ListNode(sum//10)
            l2 = l2.next
            pre = cur
            cur = cur.next
        if cur.val==0:
            pre.next = cur.next
        return self.reverse(dummy)