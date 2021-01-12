class Solution:
    """
    @param root: the root of the binary tree
    @return: all root-to-leaf paths
    """
    def binaryTreePaths(self, root):
        # write your code here
        paths = []
        if root==None:
            return paths
        leftPath = self.binaryTreePaths(root.left)
        rightPath = self.binaryTreePaths(root.right)
        for path in leftPath:
            paths.append(str(root.val)+"->"+path)
        for path in rightPath:
            paths.append(str(root.val)+"->"+path)
        if len(paths)==0:
            paths.append(str(root.val))
        return paths
            