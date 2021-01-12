class Solution:

    def canJump(self, A):
        # write your code here
        # 简历dp数组，dp[i]表示能跳到第i
        n = len(A)
        dp = [False]*n 
        dp[0] = True
        
        for i in range(1,n):
            for j in range(i):
                if dp[j] and j+A[j]>=i: # 因为是只要超过i就行
                    dp[i] = True
                    break
        return dp[n-1]