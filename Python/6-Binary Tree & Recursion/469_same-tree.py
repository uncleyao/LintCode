class Solution:

    def isIdentical(self, a, b):
        # write your code here
        if a==None and b==None:
            return True
        if a==None or b==None:
            return False
        return self.isIdentical(a.left,b.left) and self.isIdentical(a.right,b.right) and a.val==b.val