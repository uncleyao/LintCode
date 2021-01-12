class Solution:
    """
    @param head: n
    @return: The new head of reversed linked list.
    """
    def reverse(self, head):
        # write your code here
        cur = None
        while head!=None:
            temp = head.next
            head.next = cur
            cur  = head
            head = temp
        return cur
