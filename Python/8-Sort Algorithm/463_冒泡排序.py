class Solution:

    def sortIntegers(self, A):
        # write your code here
        
        for i in range(0,len(A)-1):
            for j in range(0, len(A)-1):
                if A[j]> A[j+1]:
                    A[j], A[j+1]= A[j+1],A[j]