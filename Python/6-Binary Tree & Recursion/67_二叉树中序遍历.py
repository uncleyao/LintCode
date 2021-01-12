class Solution:
    """
    @param root: A Tree
    @return: Inorder in ArrayList which contains node values.
    """
    def inorderTraversal(self, root):
        # write your code here
        if root is None:
            return []
        # 创建一个 dummy node，右指针指向 root
        # 并放到 stack 里，此时 stack 的栈顶 dummy
        # 是 iterator 的当前位置

        dummy = TreeNode(0)
        dummy.right = root
        stack = [dummy]
        
        inorder = []
        # 每次将 iterator 挪到下一个点
        # 也就是调整 stack 使得栈顶到下一个点
        while stack:
            node = stack.pop()
            if node.right:
                node = node.right
                while node:
                    stack.append(node)
                    node = node.left
            if stack:
                inorder.append(stack[-1].val)
        return inorder
