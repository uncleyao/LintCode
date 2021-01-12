class Solution:
    """
    @param A: an integer array
    @return: nothing
    """
    def sortIntegers2Merge(self, A):
        # write your code here
        temp = [0]*len(A)
        self.mergeSortHelper(A,0,len(A)-1,temp)
    
    def mergeSortHelper(self, A, left, right, temp):
        if left>=right:
            return
        mid = left+(right-left)//2
        self.mergeSortHelper(A,left,mid,temp)
        self.mergeSortHelper(A, mid+1,right,temp)
        self.merge(A,left, right, temp)
    
    def merge(self, A, left, right, temp):
        mid = left+(right-left)//2
        i = left
        j = mid+1
        for k in range(0,right-left+1):
            if i <=mid and (j>right or A[i]<A[j]):
                temp[k] = A[i]
                i+=1
            else:
                temp[k]=A[j]
                j+=1
        
        for m in range(0,right-left+1):
            A[left+m]= temp[m]



    def sortIntegers2Quick(self, A):
        # write your code here
        self.quickSort(A,0,len(A)-1)
    
    def quickSort(self, A, start, end):
        if (start>=end): return
        i,j = start,end
        pivot = A[start+(end-start)//2]
        while (i<=j):
            while (i<=j and A[i]<pivot):
                i+=1
            while (i<=j and A[j]>pivot):
                j-=1
            if (i<=j):
                A[i],A[j]= A[j], A[i]
                i+=1
                j-=1
        self.quickSort(A,start, j)
        self.quickSort(A,i,end)