from collections import deque

class Solution:
    """
    思路：
    利用队列：先加root
    每次拿出queue的第一个node然后把left, right 加到queue的最后
    再保存这个node的val到result里
    """
    def levelOrder(self, root):
        # write your code here
        if root is None:
            return []
        queue = deque([root])
        result = []
        while queue:
            level = []
            for _ in range(len(queue)):
                node = queue.popleft()
                level.append(node.val)
                if node.left:
                    queue.append(node.left)
                if node.right:
                    queue.append(node.right)
            result.append(level)
        return result