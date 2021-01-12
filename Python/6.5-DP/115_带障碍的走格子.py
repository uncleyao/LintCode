class Solution:
    """
    @param obstacleGrid: A list of lists of integers
    @return: An integer
    """
    def uniquePathsWithObstacles(self, obstacleGrid):
        # write your code here DP
        n, m = len(obstacleGrid), len(obstacleGrid[0])
        if n ==0 and m ==0:
            return 0
        dp = [[0]*m for _ in range(n)]
        if obstacleGrid[0][0]==0:
            dp[0][0]= 1 
        for i in range(0,n):
            for j in range(0,m):
                if i==0 and j ==0:
                    continue
                if obstacleGrid[i][j]==1:
                    continue
                if i==0:
                    dp[i][j] = dp[i][j-1]
                    continue
                if j==0:
                    dp[i][j] = dp[i-1][j]
                    continue
                dp[i][j] = dp[i-1][j]+dp[i][j-1]
        return dp[n-1][m-1]
        