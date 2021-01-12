class Solution:
    """
    @param: root: the root of binary tree
    @param: target: An integer
    @return: all valid paths
    """
    def binaryTreePathSum(self, root, target):
        # write your code here
        result = []
        path = []
        self.helper(root, path, target, 0, result)
        return result
        
    def helper(self, root, path, target, sum, result):
        if root is None:
            return
        path.append(root.val)
        sum+=root.val
        
        if root.left is None and root.right is None and sum == target:
            result.append(path[:])
        
        self.helper(root.left, path, target, sum, result)
        self.helper(root.right, path, target, sum, result)
        
        path.pop()